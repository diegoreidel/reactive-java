package com.reidel.pricer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner init(ProductRepository repository) {
        return args -> Flux.just(
                new Product("Apple"),
                new Product("Strawberry"),
                new Product("Banana"))
                .flatMap(repository::save)
                .subscribe(System.out::println);
    }
}
