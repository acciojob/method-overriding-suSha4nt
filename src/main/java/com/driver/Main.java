package com.driver;

public class Main {

    // Inner class A
    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    // Inner class B extends A
    public static class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }

    public static void main(String[] args) {
        B obj = new B();
        String print = obj.meth();
        System.out.println(print);
    }
}