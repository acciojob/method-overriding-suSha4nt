package com.driver;

// Task 1
class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

// Task 2 & 4
class B extends A {
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

// Task 5
public class Main {
    public static void main(String[] args) {

        // Task 3
        B obj = new B();

        // Calling overridden method
        System.out.println(obj.meth());
    }
}