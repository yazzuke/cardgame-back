package com.cards.game.domain.cards;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface CardsRepository extends MongoRepository<Cards, String> {
}