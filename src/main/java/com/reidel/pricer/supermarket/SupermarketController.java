package com.reidel.pricer.supermarket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class SupermarketController {

    private final SupermarketRepository repository;

    public SupermarketController(SupermarketRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/supermarkets")
    public Flux<Supermarket> listing() {
        return repository.findAll();
    }

}
