package org.okten.javacore.classes;

import org.okten.javacore.classes.InnerClassesDemo;
import org.okten.javacore.product.Product;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        InnerClassesDemo.InnerClass innerClass = new InnerClassesDemo().new InnerClass();
        InnerClassesDemo.InnerStaticClass innerStaticClass = new InnerClassesDemo.InnerStaticClass();

        class LocalInnerClass {

            public static void staticPrint() {
                System.out.println("I am static method");
            }

            public void print() {
                System.out.println("I am local inner class, I can not be static :(");
            }
        }

        new LocalInnerClass().print();
        LocalInnerClass.staticPrint();

        MathOperation subtractOperation = new MathOperation() {
            @Override
            public double perform(double a1, double a2) {
                return a1 - a2;
            }
        };

        MathOperation addOperation = new AddOperation();

//        System.out.println("2+2=" + addOperation.perform(2, 2));
//        System.out.println("2-1=" + subtractOperation.perform(2, 1));

        MathOperation multiplyOperation = (a1, a2) -> a1 * a2;

        addOperation
                .andThen(subtractOperation)
                .andThen(multiplyOperation)
                .andThen((a1, a2) -> a1 / a2)
                .perform(3, 4);
    }
}