package com.reidel.pricer;

import com.reidel.pricer.supermarket.Supermarket;
import com.reidel.pricer.supermarket.SupermarketRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

@Configuration
public class LoadDatabase {

//    @Bean
//    CommandLineRunner init(SupermarketRepository repository) {
//        return args -> Flux.just(
//                new Supermarket("Bourbon"),
//                new Supermarket("Carrefour"),
//                new Supermarket("Walmart"))
//                .flatMap(repository::save)
//                .subscribe(System.out::println);
//    }
}
