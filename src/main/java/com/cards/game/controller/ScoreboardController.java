package com.cards.game.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cards.game.domain.scoreboard.ScoreboardEntry;
import com.cards.game.service.ScoreboardService;
import com.cards.game.domain.scoreboard.ScoreboardRepository;

import java.util.List;

@RestController
@RequestMapping("/scoreboard")
public class ScoreboardController {

    private final ScoreboardService scoreboardService;
    private final ScoreboardRepository scoreboardRepository;

    public ScoreboardController(ScoreboardService scoreboardService, ScoreboardRepository scoreboardRepository) {
        this.scoreboardService = scoreboardService;
        this.scoreboardRepository = scoreboardRepository;
    }

    @PostMapping("/postscoreboard")
    public ResponseEntity<ScoreboardEntry> addScore(@RequestBody ScoreboardEntry entry) {
        ScoreboardEntry createdEntry = scoreboardService.createEntry(entry);
        return new ResponseEntity<>(createdEntry, HttpStatus.CREATED);
    }

    @GetMapping("/getscoreboard")
    public ResponseEntity<List<ScoreboardEntry>> getScores() {
        List<ScoreboardEntry> entries = scoreboardService.getAllEntriesSortedByTime();
        return new ResponseEntity<>(entries, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ScoreboardEntry getScoreboardById(@PathVariable String id) {
        return scoreboardRepository.findById(id).orElse(null);
    }
}