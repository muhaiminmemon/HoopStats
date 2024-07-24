import React, { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import { getPlayerByName } from '../api';

const PlayerDetail = () => {
  const { name } = useParams();
  const [player, setPlayer] = useState(null);

  useEffect(() => {
    getPlayerByName(name)
      .then(response => setPlayer(response.data[0])) // Assuming the first result is the player we're looking for
      .catch(error => console.error('Error fetching player details:', error));
  }, [name]);

  if (!player) return <div>Loading...</div>;

  return (
    <div>
      <h1>{player.playerName}</h1>
      <p>Team: {player.teamAbbreviation}</p>
      <p>Points: {player.pts}</p>
      <p>Assists: {player.ast}</p>
      {/* Add more stats as needed */}
    </div>
  );
};

export default PlayerDetail;
