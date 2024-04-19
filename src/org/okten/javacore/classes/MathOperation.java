package org.okten.javacore.classes;

@FunctionalInterface
public interface MathOperation {

    double perform(double a1, double a2);

    default MathOperation andThen(MathOperation mathOperation) {
        return (a1, a2) -> {
            double result1 = perform(a1, a2);
            System.out.println("Result 1: " + result1);
            double result2 = mathOperation.perform(a1, a2);
            System.out.println("Result 2: " + result2);
            return result2;
        };
    }
}
