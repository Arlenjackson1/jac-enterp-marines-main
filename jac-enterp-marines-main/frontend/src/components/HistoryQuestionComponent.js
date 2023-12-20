import React, { useState } from 'react'

const HistoryQuestionComponent = () => {
    const [question, setQuestion] = useState(null)
    const [selectedChoice, setSelectedChoice] = useState(null)
    const [result, setResult] = useState(null)
    const [quizStarted, setQuizStarted] = useState(false)

    const handleButtonClick = async () => {
        try {
            const response = await fetch('http://localhost:8080/api/questions/history/random')
            const data = await response.json()
            setQuestion(data)
            setSelectedChoice(null)
            setResult(null)
            setQuizStarted(true)
        } catch (error) {
            console.error('Error fetching question:', error)
        }
    }
    const handleSubmit = () => {
        if (selectedChoice === null) {
            setResult('Please select an answer before submitting.')
            return
        }
        const isCorrect = selectedChoice === question.answerIndex
        setResult(isCorrect ? 'Correct!' : 'Wrong!')
    }
    const handleNextQuestion = async () => {
        if (result !== 'Correct!') {
            setResult('You must answer the current question correctly before moving on.')
            return
        }

        try {

            const response = await fetch('http://localhost:8080/api/questions/history/random')
            const data = await response.json()
            setQuestion(data)
            setSelectedChoice(null)
            setResult(null)
        } catch (error) {
            console.error('Error fetching next question:', error)
        }
    };
    const handleChoiceClick = (index) => {
        setSelectedChoice(index)
    }

    return (
        <div>
            {!quizStarted && <button onClick={handleButtonClick}>BEGIN</button>}

            {question && (
                <div>
                    <h2>{question.questionText}</h2>
                    <div>
                        {question.choices.map((choice, index) => (
                            <div
                                key={index}
                                onClick={() => handleChoiceClick(index)}
                                style={{
                                    cursor: 'pointer',
                                    display: 'flex',
                                    alignItems: 'center',
                                    marginBottom: '10px',
                                }}
                            >
                                <div
                                    style={{
                                        width: '15px',
                                        height: '15px',
                                        borderRadius: '50%',
                                        backgroundColor:
                                            index === selectedChoice ? 'blue' : 'transparent',
                                        marginRight: '10px',
                                        border: '2px solid #ccc',
                                    }}
                                />
                                {choice}
                            </div>
                        ))}
                    </div>
                    
                        <button onClick={handleSubmit}>Submit Answer</button>
                        <button onClick={handleNextQuestion}>Next</button>
                        {result && <p>{result}</p>}
                    
                </div>
            )}
        </div>
    )
}

export default HistoryQuestionComponent