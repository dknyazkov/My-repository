package org.example.template;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private Integer price;
    private Integer weight;
    List<Product> database=new ArrayList<>();

    public Product(Integer price, Integer weight) {
        this.price = price;
        this.weight = weight;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getWeight() {
        return weight;
    }



}
