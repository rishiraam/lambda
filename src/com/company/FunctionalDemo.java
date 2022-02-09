package com.company;

@FunctionalInterface
public interface FunctionalDemo {
    public abstract void test1();

    default void test2()
    {
        System.out.println("Default function");
    }

    static void test3()
    {
        System.out.println("Static method");
    }
}
