package org.okten.javacore.figures;

public interface Shape {

    // public static final
    String CONSTANT = "константа";

    // public
    double getArea();

    default void printArea() {
        System.out.println("Area: " + getArea());
    }
}
