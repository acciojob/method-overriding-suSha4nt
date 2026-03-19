
package com.driver;

public class Main {

    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }

    public static void main(String[] args) {
        // Task 3: Create an object of class B
        B b = new B();

        // Call method meth of class A using the object of class B
//        System.out.println(b.super.meth()); // This will not work in Java. Instead, we can call it directly
        System.out.println(((A) b).meth()); // This casts b to A to call the superclass method

        // Task 5: Call the overridden method from the object of class B
        System.out.println(b.meth());
    }
}