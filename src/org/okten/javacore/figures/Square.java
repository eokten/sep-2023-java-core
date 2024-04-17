package org.okten.javacore.figures;

public class Square extends Rectangle {

    public Square(double a) {
        super(a, a);
    }

    @Override
    public String printName() {
        return "Квадрат";
    }
}
