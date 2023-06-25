package src.main.groovy.org.example;


import java.util.ArrayList;
import java.util.List;

public class ActionPhone implements Sailable<Phone>{
    List<Phone> itemPhone=new ArrayList<>();
    @Override
    public void addProduct(Phone product) {
        itemPhone.add(product);
    }

    @Override
    public void orderProduct(Phone product) {
        System.out.println("Заказ телефона оформлен");
    }

    @Override
    public void deleteProduct(Phone product) {
        itemPhone.remove(product);
    }
}
