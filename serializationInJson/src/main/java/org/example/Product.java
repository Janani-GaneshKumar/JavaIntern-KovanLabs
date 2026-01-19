package org.example;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {

    @JsonProperty("product_name")
    private String name;

    private double price;

    @JsonIgnore
    private String internalId;

    // Required by Jackson
    public Product() {}

    public Product(String name, double price, String internalId) {
        this.name = name;
        this.price = price;
        this.internalId = internalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}