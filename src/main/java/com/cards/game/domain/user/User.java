package com.cards.game.domain.user;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "users")
public class User {

    @Id
    private String id;
    private String username;
    private long time;
    private int wrongChoices;

    public void setUsername(String username) {
        this.username = username;
    }

    public User() {
        this.time = new Date().getTime() / 1000;
    }

}