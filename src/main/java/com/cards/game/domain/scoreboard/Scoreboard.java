package com.cards.game.domain.scoreboard;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document
public class Scoreboard {

    @Id
    private String id;
    private String userId;
    private String username;
    private int wrongChoices;
    private int goodChoices;
    private long timestamp;
    private long resolutionTime;

    // Getters and setters...
}