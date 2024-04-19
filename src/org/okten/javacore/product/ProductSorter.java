package org.okten.javacore.product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Collections.reverseOrder;
import static java.util.Comparator.comparing;

public class ProductSorter {

    public static void main(String[] args) {
        Product p1 = new Product("p1", 2.99);
        Product p2 = new Product("p2", 3.49);
        Product p3 = new Product("p3", 13.89);
        Product p4 = new Product("p4", 0.99);
        Product p5 = new Product("p5", 21.47);

        ArrayList<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);

        Collections.shuffle(products);

        System.out.println(products);

        Collections.sort(products, reverseOrder(comparing(Product::getPrice)));
        System.out.println(products);
    }
}
