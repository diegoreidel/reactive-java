package com.reidel.pricer.supermarket;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface SupermarketRepository extends ReactiveCrudRepository<Supermarket, String> {
}
