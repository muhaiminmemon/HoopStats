package com.nba.nba_zone.entity;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.nba.nba_zone.entity.NbaPlayerStats;
import com.nba.nba_zone.entity.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    private final PlayerService playerService;
    private final ObjectMapper objectMapper;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
        this.objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
    }

    @GetMapping(produces = "application/json")
    public ResponseEntity<String> getAllPlayers() throws Exception {
        List<NbaPlayerStats> players = playerService.getPlayerStats();
        return ResponseEntity.ok(objectMapper.writeValueAsString(players));
    }

    @GetMapping(value = "/{name}", produces = "application/json")
    public ResponseEntity<String> getPlayerByName(@PathVariable String name) throws Exception {
        List<NbaPlayerStats> players = playerService.getPlayerStats(name);
        return ResponseEntity.ok(objectMapper.writeValueAsString(players));
    }

    @PostMapping(produces = "application/json", consumes = "application/json")
    public ResponseEntity<NbaPlayerStats> addPlayer(@RequestBody NbaPlayerStats player) {
        NbaPlayerStats savedPlayer = playerService.savePlayer(player);
        return ResponseEntity.ok(savedPlayer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlayer(@PathVariable Long id) {
        playerService.deletePlayerById(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/name/{name}")
    public ResponseEntity<Void> deletePlayerByName(@PathVariable String name) {
        playerService.deletePlayerByName(name);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/sorted/assists", produces = "application/json")
    public ResponseEntity<String> getPlayersSortedByAssists() throws Exception {
        List<NbaPlayerStats> players = playerService.getPlayersSortedByAssists();
        return ResponseEntity.ok(objectMapper.writeValueAsString(players));
    }

    @GetMapping(value = "/sorted/rebounds", produces = "application/json")
    public ResponseEntity<String> getPlayersSortedByRebounds() throws Exception {
        List<NbaPlayerStats> players = playerService.getPlayersSortedByRebounds();
        return ResponseEntity.ok(objectMapper.writeValueAsString(players));
    }

    @GetMapping(value = "/sorted/steals", produces = "application/json")
    public ResponseEntity<String> getPlayersSortedBySteals() throws Exception {
        List<NbaPlayerStats> players = playerService.getPlayersSortedBySteals();
        return ResponseEntity.ok(objectMapper.writeValueAsString(players));
    }

    @GetMapping(value = "/sorted/points", produces = "application/json")
    public ResponseEntity<String> getPlayersSortedByPoints() throws Exception {
        List<NbaPlayerStats> players = playerService.getPlayersSortedByPoints();
        return ResponseEntity.ok(objectMapper.writeValueAsString(players));
    }

    @GetMapping(value = "/sorted/team", produces = "application/json")
    public ResponseEntity<String> getPlayersSortedByTeamName() throws Exception {
        List<NbaPlayerStats> players = playerService.getPlayersSortedByTeamName();
        return ResponseEntity.ok(objectMapper.writeValueAsString(players));
    }
}
