package com.cards.game.service;

import org.springframework.stereotype.Service;

import com.cards.game.domain.scoreboard.ScoreboardEntry;
import com.cards.game.domain.scoreboard.ScoreboardRepository;

import java.util.List;

@Service
public class ScoreboardService {

    private final ScoreboardRepository scoreboardRepository;

    public ScoreboardService(ScoreboardRepository scoreboardRepository) {
        this.scoreboardRepository = scoreboardRepository;
    }

    public ScoreboardEntry createEntry(ScoreboardEntry entry) {
        return scoreboardRepository.save(entry);
    }

    public List<ScoreboardEntry> getAllEntriesSortedByTime() {
        return scoreboardRepository.findAllByOrderByResolutionTimeAsc();
    }
}