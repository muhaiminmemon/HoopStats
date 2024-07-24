import React, { useEffect, useState } from 'react';
import { getAllPlayers } from '../api';

const PlayerList = () => {
  const [players, setPlayers] = useState([]);

  useEffect(() => {
    getAllPlayers()
      .then(response => setPlayers(response.data))
      .catch(error => console.error('Error fetching players:', error));
  }, []);

  return (
    <div>
      <h1>NBA Players</h1>
      <ul>
        {players.map(player => (
          <li key={player.id}>{player.playerName} - {player.teamAbbreviation}</li>
        ))}
      </ul>
    </div>
  );
};

export default PlayerList;
