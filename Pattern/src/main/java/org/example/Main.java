package org.example;

import org.example.dekorator.AddToDB;
import org.example.dekorator.OutMail;
import org.example.dekorator.Service;
import org.example.template.ConsumerProductService;
import org.example.template.IndustrialProductService;
import org.example.template.Product;
import org.example.template.ProductService;

public class Main {
    public static void main(String[] args) {
   /*     Product beer=new Product(10,20);
        Product cotton=new Product(100,50);
        ProductService industrial=new IndustrialProductService();
       ProductService consumer=new ConsumerProductService();
        consumer.registration(beer);
        industrial.registration(cotton);*/



Service newMail=new AddToDB(new OutMail());
newMail.sendMessage("Hello");


    }
}
