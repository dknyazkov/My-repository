package src.main.groovy.org.example;

import java.util.List;
import java.util.ArrayList;


public class ActionLaptop implements Sailable<Laptop>{
    List<Laptop> itemLaptop=new ArrayList<>();
    @Override
    public void addProduct(Laptop product) {
        itemLaptop.add(product);
    }

    @Override
    public void orderProduct(Laptop product) {
        System.out.println("Заказ ноутбука оформлен");
    }

    @Override
    public void deleteProduct(Laptop product) {
        itemLaptop.remove(product);
    }
}



