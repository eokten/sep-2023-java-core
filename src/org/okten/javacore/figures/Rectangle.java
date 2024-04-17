package org.okten.javacore.figures;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Rectangle implements Shape {

    private final double a1;
    private final double a2;

    @Override
    public double getArea() {
        return a1 * a2;
    }

    public abstract String printName();

    public final void printBlaBlaBla() {
        System.out.println("bla bla bla");
    }
}
