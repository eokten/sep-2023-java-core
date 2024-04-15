package org.okten.javacore;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        char a1 = '8';
//        char a2 = 56;
//        System.out.println(a1);
//        System.out.println(a2);

//        // caching: -129 - 128
//        Integer i1 = 100;
//        Integer i2 = 100;
//        System.out.println(i1 == i2); // true
//
//        Integer i3 = 200;
//        Integer i4 = 200;
//        System.out.println(i3 == i4); // false

        Product product1 = new Product("test product", 1.12);
        Product product2 = new Product();
//        System.out.println(product1.getName() + ": " + product1.getPrice());
//        System.out.println(product2.getName() + ": " + product2.getPrice());

//        Product[] productsToBuy = new Product[]{product1, product2};
//        ProductCart productCart = new ProductCart();
//        productCart.setProducts(productsToBuy);
//        System.out.println(Arrays.toString(productCart.getProducts()));

//        Product[] productsToBuy = new Product[3];
//        productsToBuy[0] = product1;
//        productsToBuy[1] = product2;
//        ProductCart productCart = new ProductCart();
//        productCart.setProducts(productsToBuy);
//        System.out.println(Arrays.toString(productCart.getProducts()));

//        productsToBuy[2] = new Product("new product", 10.99);
//        System.out.println(Arrays.toString(productCart.getProducts()));

//        for (Product productToBuy : productsToBuy) {
//            System.out.println("Я планую купити: " + productToBuy);
//        }
//
//        for (int index = 0; index < productsToBuy.length; index++) {
//            System.out.println("Я планую купити: " + productsToBuy[index]);
//        }

//        System.out.println("While");
//        int number = 20;
//        while (number < 10) {
//            number++;
//            System.out.println(number);
//        }
//
//        System.out.println("Do While");
//        number = 20;
//        do {
//            number++;
//            System.out.println(number);
//        } while (number < 10);
//
//        number = 3;
//        if (number < 10 || number > 5) {
//            System.out.println("Number is greater than 10 and less than 5");
//        }

        ArrayList productsToBuy = new ArrayList();
        productsToBuy.add(product1);
        productsToBuy.add(product2);
        System.out.println(productsToBuy);
    }
}