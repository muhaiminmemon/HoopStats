import requests
import pandas as pd
import os

# Define the URL with PerMode set to PerGame
url = "https://stats.nba.com/stats/leaguedashplayerstats?College=&Conference=&Country=&DateFrom=&DateTo=&Division=&DraftPick=&DraftYear=&GameScope=&GameSegment=&Height=&ISTRound=&LastNGames=0&LeagueID=00&Location=&MeasureType=Base&Month=0&OpponentTeamID=0&Outcome=&PORound=0&PaceAdjust=N&PerMode=PerGame&Period=0&PlayerExperience=&PlayerPosition=&PlusMinus=N&Rank=N&Season=2023-24&SeasonSegment=&SeasonType=Playoffs&ShotClockRange=&StarterBench=&TeamID=0&VsConference=&VsDivision=&Weight="

# Set the headers to avoid request blocking
headers = {
    "Host": "stats.nba.com",
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/85.0.4183.121 Safari/537.36",
    "Accept": "application/json, text/plain, */*",
    "Accept-Language": "en-US,en;q=0.9",
    "Accept-Encoding": "gzip, deflate, br",
    "Connection": "keep-alive",
    "Referer": "https://stats.nba.com/",
    "Origin": "https://stats.nba.com",
    "x-nba-stats-origin": "stats",
    "x-nba-stats-token": "true"
}

# Send the request
response = requests.get(url, headers=headers)
data = response.json()

# Extract the relevant data
headers = data['resultSets'][0]['headers']
rows = data['resultSets'][0]['rowSet']

# Create a DataFrame
df = pd.DataFrame(rows, columns=headers)

# Get the current directory
current_directory = os.path.dirname(os.path.abspath(__file__))

# Save to CSV within the same folder
csv_path = os.path.join(current_directory, 'nba_player_stats_2023_24_per_game.csv')
df.to_csv(csv_path, index=False)

# Display the first few rows of the DataFrame
print(df.head())

# Optionally, display the full DataFrame in a way that suits you (e.g., using pandas' display function if in Jupyter)
print("Data saved to:", csv_path)
