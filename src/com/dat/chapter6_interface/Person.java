package com.dat.chapter6_interface;

public interface Person {
    public default void welcome() {
        System.out.println("Xin chao Viet Nam");
    }
}
