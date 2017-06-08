package com.example.cuzziepetrolapp.model;

import java.math.BigDecimal;

/**
 * Created by Cuzzie on 6/8/2017.
 */
public class Petrol {

    private String name;
    private BigDecimal price;
    private String description;

    public Petrol() {
    }

    public Petrol(String name) {
        this.name = name;
    }

    public Petrol(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public Petrol(String name, BigDecimal price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
