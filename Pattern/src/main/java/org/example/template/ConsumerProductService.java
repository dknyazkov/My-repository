package org.example.template;

public class ConsumerProductService extends ProductService {
    @Override
    public void priceOfDelivery(Product product) {
        System.out.println(product.getPrice()* product.getWeight()) ;

    }
}
