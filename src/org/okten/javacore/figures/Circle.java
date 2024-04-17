package org.okten.javacore.figures;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Circle implements Shape {

    private final double r;

    @Override
    public double getArea() {
        return 3.14 * r * r / 2;
    }
}
