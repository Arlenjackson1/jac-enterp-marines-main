import React from 'react';
import { Link } from 'react-router-dom';

const NavBar = () => {
    const navBarStyle = {
        backgroundColor: 'purple',
        color: 'white',
        padding: '15px',
        textAlign: 'center',
    };

    const listItemStyle = {
        display: 'inline-block',
        marginRight: '20px',
    };

    const linkStyle = {
        textDecoration: 'none',
        color: 'white',
        fontWeight: 'bold',
        fontSize: '18px',
    };

    return (
        <nav style={navBarStyle}>
            <ul>
                <li style={listItemStyle}><Link to="/" style={linkStyle}>Home</Link></li>
                <li style={listItemStyle}><Link to="/trivia" style={linkStyle}>Trivia</Link></li>
                <li style={listItemStyle}><Link to="/rps" style={linkStyle}>RPS</Link></li>
                <li style={listItemStyle}><Link to="/wordguesser" style={linkStyle}>Word Guesser</Link></li>
            </ul>
        </nav>
    );
}

export default NavBar;
