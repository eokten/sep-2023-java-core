package org.okten.javacore;

public class Product {

    private String name;

    private double price;

    {
        System.out.println("anon constructor");
    }

    public Product() {
        name = "default product";
        price = 0.0;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //getter
    public String getName() {
        return name;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}
