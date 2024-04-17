package org.okten.javacore.product;

import java.util.List;

public record Shop(
        String name,
        String location,
        List<Product> products
) {

    public Shop changeName(String newName) {
        return new Shop(newName, location, products);
    }

    public void addNewProduct(String name, double price) {
        products.add(new Product(name, price * 1.2));
    }
}
