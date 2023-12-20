import React from "react";
import { Link } from "react-router-dom";

const TriviaPage = () => {
  const containerStyle = {
    display: "flex",
    flexDirection: "column",
    alignItems: "center",
    justifyContent: "center",
    maxHeight: "100vh",
  };

  const buttonContainerStyle = {
    marginTop: "20px",
  };

  return (
    <div style={containerStyle}>
      <h1>Welcome to Trivia!</h1>
      <p>Please select your subject of interest:</p>
      <div style={buttonContainerStyle}>
        <button>
          <Link to="/art">Art</Link>
        </button>
        <button>
          <Link to="/history">History</Link>
        </button>
        <button>
          <Link to="/science">Science</Link>
        </button>
      </div>
    </div>
  );
};

export default TriviaPage;
