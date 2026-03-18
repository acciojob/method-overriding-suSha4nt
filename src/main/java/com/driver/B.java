package com.driver;

public class B extends A{
    @Override
    public String meth() {
        return "Method is overridden in Extendend class B";
    }
    public static void main(String[] args) {
        B obj = new B();
        String ans = obj.meth();
        System.out.println(ans);
    }
}
