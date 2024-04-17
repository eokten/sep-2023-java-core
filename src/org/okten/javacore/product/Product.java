package org.okten.javacore.product;

import lombok.Data;

@Data
public class Product {

    public static int count = 0;

    private String name;

    private double price;

    private Status status;

    static {
        System.out.println("I am executing only one time");
    }

    {
        System.out.println("anon constructor");
    }

    public Product() {
        name = "default product";
        price = 0.0;
        count++;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}
