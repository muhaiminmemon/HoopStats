package com.nba.nba_zone.entity;

import com.nba.nba_zone.entity.NbaPlayerStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NbaPlayerStatsRepository extends JpaRepository<NbaPlayerStats, Long> {
    List<NbaPlayerStats> findByPlayerNameContainingIgnoreCase(String name);
    void deleteByPlayerName(String playerName);

    // Custom queries for sorting by stats
    List<NbaPlayerStats> findAllByOrderByAstDesc();
    List<NbaPlayerStats> findAllByOrderByRebDesc();
    List<NbaPlayerStats> findAllByOrderByStlDesc();
    List<NbaPlayerStats> findAllByOrderByPtsDesc();
}
