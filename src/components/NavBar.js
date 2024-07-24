import React from 'react';
import { Link } from 'react-router-dom';
import './NavBar.css';

const NavBar = () => {
  return (
    <nav className="navbar">
      <ul>
        <li><Link to="/">Home</Link></li>
        <li><Link to="/sorted/assists">Top Assists</Link></li>
        <li><Link to="/sorted/rebounds">Top Rebounds</Link></li>
        <li><Link to="/sorted/steals">Top Steals</Link></li>
        <li><Link to="/sorted/points">Top Points</Link></li>
        <li><Link to="/sorted/team">Sort by Team</Link></li>
      </ul>
    </nav>
  );
};

export default NavBar;
