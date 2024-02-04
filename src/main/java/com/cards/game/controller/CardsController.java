package com.cards.game.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.cards.game.domain.cards.CardsRepository;
import com.cards.game.domain.cards.Cards;

@RestController
@RequestMapping("/cards")
public class CardsController {
    private final CardsRepository CardsRepository;

    public CardsController(CardsRepository imageDataRepository) {
        this.CardsRepository = imageDataRepository;
    }

    @GetMapping("/cardsimg")
    public List<Cards> getAllImageData() {
        return CardsRepository.findAll();
    }
}