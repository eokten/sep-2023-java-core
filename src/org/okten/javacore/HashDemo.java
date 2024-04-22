package org.okten.javacore;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashDemo {

    public static void main(String[] args) {
        Product laptop1 = new Product();
        Product laptop2 = new Product();
        Product phone = new Product();

        laptop1.setName("laptop");
        laptop2.setName("laptop");
        phone.setName("phone");

//        System.out.println(laptop1.hashCode());
//        System.out.println(laptop2.hashCode());
//        System.out.println(phone.hashCode());

        Set<Product> products = new HashSet<>();
        products.add(laptop1);
        products.add(laptop2);
        products.add(phone);

        System.out.println(products);

        Map<String, Product> productsByName = new HashMap<>();
        productsByName.put(laptop1.getName(), laptop1);
        productsByName.put(laptop2.getName(), laptop2);
        productsByName.put(phone.getName(), phone);
        System.out.println("HashMap: " + productsByName);
    }
}
