package com.cards.game.domain.cards;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document
public class Cards {

    @Id
    private String id;
    private String image;
    private String key;
    private String text;
    private boolean isSelected;

}
