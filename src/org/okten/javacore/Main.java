package org.okten.javacore;

import java.io.IOException;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        print(10);
//        System.out.println("Finished");
        try (CustomAutoClosable customAutoClosable = new CustomAutoClosable()) {
            customAutoClosable.print();
        } finally {
            System.out.println("finally");
        }
    }

    private static void print(int number) {
        try {
            printWithException(number);
        } catch (CustomException e) {
            System.out.println("Arithmetic exception catched here");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }

    private static void printWithException(int number) throws Exception, CustomException {
        if (number > 100) {
            if (new Random().nextBoolean()) {
                throw new CustomException("Random exception");
            }
            throw new Exception("Number is too big");
        } else {
            System.out.println(number);
            printWithException(number + 1);
        }
    }
}
