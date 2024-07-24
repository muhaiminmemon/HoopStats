package com.nba.nba_zone.entity;

import com.nba.nba_zone.entity.NbaPlayerStats;
import com.nba.nba_zone.entity.NbaPlayerStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerService {

    private final NbaPlayerStatsRepository playerStatsRepository;

    @Autowired
    public PlayerService(NbaPlayerStatsRepository playerStatsRepository) {
        this.playerStatsRepository = playerStatsRepository;
    }

    public List<NbaPlayerStats> getPlayerStats() {
        return playerStatsRepository.findAll();
    }

    public List<NbaPlayerStats> getPlayerStats(String name) {
        return playerStatsRepository.findByPlayerNameContainingIgnoreCase(name);
    }

    public NbaPlayerStats savePlayer(NbaPlayerStats player) {
        return playerStatsRepository.save(player);
    }

    public void deletePlayerById(Long id) {
        playerStatsRepository.deleteById(id);
    }

    public void deletePlayerByName(String name) {
        playerStatsRepository.deleteByPlayerName(name);
    }

    public List<NbaPlayerStats> getPlayersSortedByAssists() {
        return playerStatsRepository.findAllByOrderByAstDesc();
    }

    public List<NbaPlayerStats> getPlayersSortedByRebounds() {
        return playerStatsRepository.findAllByOrderByRebDesc();
    }

    public List<NbaPlayerStats> getPlayersSortedBySteals() {
        return playerStatsRepository.findAllByOrderByStlDesc();
    }

    public List<NbaPlayerStats> getPlayersSortedByPoints() {
        return playerStatsRepository.findAllByOrderByPtsDesc();
    }

    public List<NbaPlayerStats> getPlayersSortedByTeamName() {
        return playerStatsRepository.findAll().stream()
                .sorted(Comparator.comparing(player -> TeamNameUtil.getTeamName(player.getTeamAbbreviation())))
                .collect(Collectors.toList());
    }
}

