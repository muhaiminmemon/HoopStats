import axios from 'axios';

const API_URL = 'http://localhost:8080/api/players'; // Adjust the URL to match your backend endpoint

export const getAllPlayers = () => axios.get(API_URL);
export const getPlayerByName = (name) => axios.get(`${API_URL}/${name}`);
export const getPlayersSortedByAssists = () => axios.get(`${API_URL}/sorted/assists`);
export const getPlayersSortedByRebounds = () => axios.get(`${API_URL}/sorted/rebounds`);
export const getPlayersSortedBySteals = () => axios.get(`${API_URL}/sorted/steals`);
export const getPlayersSortedByPoints = () => axios.get(`${API_URL}/sorted/points`);
export const getPlayersSortedByTeamName = () => axios.get(`${API_URL}/sorted/team`);
