package org.example.template;

public class IndustrialProductService extends ProductService {
    @Override
    public void priceOfDelivery(Product product) {
        System.out.println( product.getPrice()* product.getWeight()*2);
    }
}
