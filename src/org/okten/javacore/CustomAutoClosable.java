package org.okten.javacore;

public class CustomAutoClosable implements AutoCloseable {

    public void print() {
        System.out.println("I am auto closable class, but not forget to put me in try-with-resources block");
    }

    @Override
    public void close() {
        System.out.println("I am closing");
    }
}
