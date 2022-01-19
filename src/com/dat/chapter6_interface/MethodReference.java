package com.dat.chapter6_interface;

public class MethodReference {

    public static void main(String[] args) {
        new MethodReference();
    }

    public MethodReference() {
        // control(MethodReference::show);
    }

    public void control(Named named) {
        // named.welcome();
        // System.out.println("Hello Dat");
        // named.welcome();
    }

    public static void show() {
        System.out.println("My Name is Vu Tien Dat, here is MethodRefference");
    }
}
