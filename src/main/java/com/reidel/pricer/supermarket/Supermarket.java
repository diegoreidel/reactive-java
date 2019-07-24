package com.reidel.pricer.supermarket;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Supermarket {

    @Id
    private String id;
    private String name;
    private String address;
    private boolean favorite;
    private String priceRange;
    private float rating;
    private String notes;

    public Supermarket(String name) {
        this.name = name;
    }
}
