package src.main.groovy.org.example;


import java.util.ArrayList;
import java.util.List;

public abstract class Product {
    List<Product> item=new ArrayList<>();
    String model;
    double screenSize;

    public Product() {
    }

    public Product(String model, double screenSize, int memorySize, int price) {
        this.model = model;
        this.screenSize = screenSize;
        this.memorySize = memorySize;
        this.price = price;
    }

    int memorySize;
    int price;

}


