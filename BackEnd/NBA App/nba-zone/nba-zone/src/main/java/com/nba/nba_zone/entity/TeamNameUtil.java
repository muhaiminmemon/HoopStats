package com.nba.nba_zone.entity;

import java.util.HashMap;
import java.util.Map;

public class TeamNameUtil {
    private static final Map<String, String> TEAM_NAMES = new HashMap<>();

    static {
        TEAM_NAMES.put("ATL", "Atlanta Hawks");
        TEAM_NAMES.put("BOS", "Boston Celtics");
        TEAM_NAMES.put("BKN", "Brooklyn Nets");
        TEAM_NAMES.put("CHA", "Charlotte Hornets");
        TEAM_NAMES.put("CHI", "Chicago Bulls");
        TEAM_NAMES.put("CLE", "Cleveland Cavaliers");
        TEAM_NAMES.put("DAL", "Dallas Mavericks");
        TEAM_NAMES.put("DEN", "Denver Nuggets");
        TEAM_NAMES.put("DET", "Detroit Pistons");
        TEAM_NAMES.put("GSW", "Golden State Warriors");
        TEAM_NAMES.put("HOU", "Houston Rockets");
        TEAM_NAMES.put("IND", "Indiana Pacers");
        TEAM_NAMES.put("LAC", "Los Angeles Clippers");
        TEAM_NAMES.put("LAL", "Los Angeles Lakers");
        TEAM_NAMES.put("MEM", "Memphis Grizzlies");
        TEAM_NAMES.put("MIA", "Miami Heat");
        TEAM_NAMES.put("MIL", "Milwaukee Bucks");
        TEAM_NAMES.put("MIN", "Minnesota Timberwolves");
        TEAM_NAMES.put("NOP", "New Orleans Pelicans");
        TEAM_NAMES.put("NYK", "New York Knicks");
        TEAM_NAMES.put("OKC", "Oklahoma City Thunder");
        TEAM_NAMES.put("ORL", "Orlando Magic");
        TEAM_NAMES.put("PHI", "Philadelphia 76ers");
        TEAM_NAMES.put("PHX", "Phoenix Suns");
        TEAM_NAMES.put("POR", "Portland Trail Blazers");
        TEAM_NAMES.put("SAC", "Sacramento Kings");
        TEAM_NAMES.put("SAS", "San Antonio Spurs");
        TEAM_NAMES.put("TOR", "Toronto Raptors");
        TEAM_NAMES.put("UTA", "Utah Jazz");
        TEAM_NAMES.put("WAS", "Washington Wizards");
    }

    public static String getTeamName(String abbreviation) {
        return TEAM_NAMES.getOrDefault(abbreviation, abbreviation);
    }
}
