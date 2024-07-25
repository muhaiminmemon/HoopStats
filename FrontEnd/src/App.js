// src/App.js
import React from 'react';
import { Route, Routes } from 'react-router-dom';
import NavBar from './components/NavBar';
import Home from './components/Home';
import PlayerList from './components/PlayerList';
import PlayerDetail from './components/PlayerDetail';
import SortedAssists from './components/SortedAssists';
import SortedRebounds from './components/SortedRebounds';
import SortedSteals from './components/SortedSteals';
import SortedPoints from './components/SortedPoints';
import SortedTeam from './components/SortedTeam';
import './App.css';

const App = () => {
  return (
    <div>
      <NavBar />
      <div className="main-content">
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/players" element={<PlayerList />} />
          <Route path="/player/:name" element={<PlayerDetail />} />
          <Route path="/sorted/assists" element={<SortedAssists />} />
          <Route path="/sorted/rebounds" element={<SortedRebounds />} />
          <Route path="/sorted/steals" element={<SortedSteals />} />
          <Route path="/sorted/points" element={<SortedPoints />} />
          <Route path="/sorted/team" element={<SortedTeam />} />
        </Routes>
      </div>
    </div>
  );
};

export default App;
