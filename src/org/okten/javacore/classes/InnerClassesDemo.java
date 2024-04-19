package org.okten.javacore.classes;

public class InnerClassesDemo {

    private String data;

    public class InnerClass {

        private String data;

        public void print() {
            System.out.println(InnerClassesDemo.this.data);
        }
    }

    public static class InnerStaticClass {

        public static int COUNT = 10;

        private String data2;

        public String getData2() {
            return data2;
        }
    }
}
