package org.okten.javacore.classes;

public class AddOperation implements MathOperation {

    @Override
    public double perform(double a1, double a2) {
        return a1 + a2;
    }
}
