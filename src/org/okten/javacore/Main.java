package org.okten.javacore;

import org.okten.javacore.product.Product;
import org.okten.javacore.product.Shop;
import org.okten.javacore.product.Status;

import java.util.ArrayList;

public class Main {

    public static final String MAIN_CONSTANT = "Головна константа";

    public static void main(String[] args) {
        System.out.println("test");
//        Product product1 = new Product("test product", 1.12);
//        product1.setStatus(Status.ACTIVE);
//        System.out.println("Product count: " + Product.count);
//
//        Product product2 = new Product();
//        product2.setStatus(Status.DISCARDED);
//        System.out.println("Product count: " + Product.count);
//
//        ArrayList<Product> productsToBuy = new ArrayList<Product>();
//        productsToBuy.add(product1);
//        productsToBuy.add(product2);
//
//        for (Product product : productsToBuy) {
//            Status activeStatus = Status.ACTIVE;
//            if (product.getStatus().equals(activeStatus)) {
//                System.out.println("На складі: " + product.getName());
//            }
//        }
//        Status parsedActiveStatus = Status.valueOf("ACTIVE");
//        System.out.println(parsedActiveStatus.toString());
//
//        Shop shop = new Shop("Наш Магазин", "Тут", productsToBuy);
//        System.out.println(shop.name());
    }
}