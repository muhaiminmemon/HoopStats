// src/components/Home.js
import lebron from './lebron.png';
import React from 'react';
import { Link } from 'react-router-dom';
import './Home.css';

const Home = () => {
  return (
    <div className="home-container">
      <div className="home-content">
        <h1>NBA Player Statistics</h1>
        <p>Browse and explore NBA player data with ease</p>
        <Link to="/players" className="btn-primary">Discover player profiles</Link>
        <p className="subtitle">Find the information you need to stay informed</p>
      </div>
      <div className="player-image">
        <img src={lebron} alt="NBA Player" />
      </div>
    </div>
  );
};

export default Home;
