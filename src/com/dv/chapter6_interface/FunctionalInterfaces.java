package com.dv.chapter6_interface;

// Funtional Interface has only one abstract method
// This is compitable with Lambda Expression
@FunctionalInterface
public interface FunctionalInterfaces {
    public void show(String name, int age);
    public default void sayHello() {
        System.out.println("Xin chao cac ban");
    }
}
