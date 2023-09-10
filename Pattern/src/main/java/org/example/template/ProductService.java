package org.example.template;

import org.example.template.Product;

public abstract class ProductService {

    public void registration(Product product) {
        System.out.println("Ordering");
        product.database.add(product);
        System.out.println("Order added to DB");
       priceOfDelivery(product);

    }

    public abstract void priceOfDelivery(Product product);
}
