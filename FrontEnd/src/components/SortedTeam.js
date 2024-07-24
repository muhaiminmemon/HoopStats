import React, { useEffect, useState } from 'react';
import { getPlayersSortedByTeamName } from '../api';

const SortedTeam = () => {
  const [players, setPlayers] = useState([]);

  useEffect(() => {
    getPlayersSortedByTeamName()
      .then(response => {
        console.log(response.data);  // Log the response to check the data
        setPlayers(response.data);
      })
      .catch(error => console.error('Error fetching players:', error));
  }, []);

  return (
    <div>
      <h1>Players Sorted by Team</h1>
      <table>
        <thead>
          <tr>
            <th>Player Name</th>
            <th>Team</th>
            <th>Points</th>
            <th>Assists</th>
            <th>Rebounds</th>
            <th>Steals</th>
            <th>Blocks</th>
          </tr>
        </thead>
        <tbody>
          {players.map(player => (
            <tr key={player.id}>
              <td>{player.playerName}</td>
              <td>{player.teamAbbreviation}</td>
              <td>{player.pts}</td>
              <td>{player.ast}</td>
              <td>{player.reb}</td>
              <td>{player.stl}</td>
              <td>{player.blk}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default SortedTeam;
