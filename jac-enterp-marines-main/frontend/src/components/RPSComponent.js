import React, { useState } from 'react';

const RPSComponent = () => {
  const [wins, setWins] = useState(0);
  const [losses, setLosses] = useState(0);
  const [draws, setDraws] = useState(0);
  const [result, setResult] = useState('');
  const [gameOver, setGameOver] = useState(false);

  const choices = ['Rock', 'Paper', 'Scissors'];

  const playRound = (userChoice) => {
    if (gameOver) {
      return;
    }

    const computerChoice = choices[Math.floor(Math.random() * 3)];

    if (userChoice === computerChoice) {
      setDraws(draws + 1);
      setResult("It's a draw!");
    } else if (
      (userChoice === 'Rock' && computerChoice === 'Scissors') ||
      (userChoice === 'Paper' && computerChoice === 'Rock') ||
      (userChoice === 'Scissors' && computerChoice === 'Paper')
    ) {
      setWins(wins + 1);
      setResult(`You win! Computer chose ${computerChoice}.`);
    } else {
      setLosses(losses + 1);
      setResult(`You lose! Computer chose ${computerChoice}.`);
    }

    if (wins === 5 || losses === 5) {
      setGameOver(true);
      setResult(wins === 5 ? 'Congratulations, you win the series!' : 'Game over. Computer wins the series.');
    }
  };

  const resetGame = () => {
    setWins(0);
    setLosses(0);
    setDraws(0);
    setResult('');
    setGameOver(false);
  };

  // Define styles for the buttons
  const buttonContainerStyle = {
    display: 'flex',
    justifyContent: 'center', // Center the buttons horizontally
    marginBottom: '10px', // Add some space below the buttons
  };

  const buttonStyle = {
    backgroundColor: '#9f00c5', // Green color
    color: 'white',
    padding: '10px 20px', // Padding around the text
    margin: '5px', // Margin between buttons
    fontSize: '16px', // Font size
    borderRadius: '5px', // Rounded corners
    cursor: 'pointer', // Change cursor on hover
  };

  return (
    <div>
      <h2 style={{textAlign: 'center'}}>Rock, Paper, Scissors</h2>
      <div style={buttonContainerStyle}>
        {choices.map((choice) => (
          <button
            key={choice}
            onClick={() => playRound(choice)}
            disabled={gameOver}
            style={buttonStyle} // Apply inline styles
          >
            {choice}
          </button>
        ))}
      </div>
      <p>{result}</p>
      <p style={{textAlign: 'center'}}>Wins: {wins} | Losses: {losses} | Draws: {draws}</p>
      {gameOver && (
        <button
          onClick={resetGame}
          style={{ ...buttonStyle, backgroundColor: '#2196F3' }} // Change color for the "Play Again" button
        >
          Play Again
        </button>
      )}
    </div>
  );
};

export default RPSComponent;
