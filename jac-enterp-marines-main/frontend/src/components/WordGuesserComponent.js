import React, { useState } from 'react'
import { terms, definitions } from './context/WordGuesserArrays'

const WordGuesserComponent = () => {
    const [wordSelection] = useState(terms)

    const [word, setWord] = useState('')
    const [hiddenWord, setHiddenWord] = useState([])
    const [lettersUsed, setLettersUsed] = useState([])
    const [miss, setMiss] = useState(0)
    const [gameResult, setGameResult] = useState('')

    const initializeGame = () => {
        const index = Math.floor(Math.random() * wordSelection.length)
        const selectedWord = wordSelection[index]
        setWord(selectedWord)

        const initialHiddenWord = Array(selectedWord.length).fill('*')
        setHiddenWord(initialHiddenWord)
        setLettersUsed([])
        setMiss(0)
        setGameResult('')
    }

    const handleLetterInput = (userInput) => {
        setLettersUsed([...lettersUsed, userInput])

        const updatedHiddenWord = [...hiddenWord]
        let match = false

        for (let j = 0; j < word.length; j++) {
            if (userInput.toLowerCase() === word[j]) {
                updatedHiddenWord[j] = userInput.toLowerCase()
                match = true
            }
        }

        setHiddenWord(updatedHiddenWord)

        if (!match) {
            setMiss((prevMiss) => prevMiss + 1)
        }

        if (updatedHiddenWord.join('') === word) {
            setGameResult(`Congratulations! You win. The word was: ${word} - ${definitions[terms.indexOf(word)]}`)

        } else if (miss + 1 === word.length - 2) {
            setGameResult(`Game Over! The word was: ${word} - ${definitions[terms.indexOf(word)]}`)

        }
    }

    const handleCheckLetter = () => {
        if (!word) {
            initializeGame()
            return
        }

        const inputElement = document.getElementById('letterInput')
        const userInput = inputElement.value.trim()

        if (userInput.length === 1 && /^[a-zA-Z]$/.test(userInput)) {
            handleLetterInput(userInput);
        } else {
            setGameResult('Please enter a single letter.')
        }

        inputElement.value = ''
    }

    return (
        <div style={{textAlign: 'center'}}>
            {!word && <button onClick={initializeGame}style={{margin: '10px', fontSize: '18px'}}>Begin</button>}

            {word && (
                <>
                    <h2>Word Guesser</h2>
                    <p>{hiddenWord.join(' ')}</p>
                    <p>Letters Used: {lettersUsed.join(' ')}</p>
                    <p>Misses: {miss}</p>
                    <input id="letterInput" type="text" maxLength="1" />
                    <button onClick={handleCheckLetter}>Check Letter</button>
                    <button onClick={initializeGame}>New Game</button>
                    {gameResult && <p>{gameResult}</p>}
                </>
            )}
        </div>
    )
}
export default WordGuesserComponent
