package com.cards.game.domain.scoreboard;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Sort;
import java.util.List;

@Repository
public interface ScoreboardRepository extends MongoRepository<Scoreboard, String> {
    List<Scoreboard> findAllByOrderByResolutionTimeAsc();
}
