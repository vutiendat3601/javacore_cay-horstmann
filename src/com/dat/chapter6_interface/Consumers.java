package com.dat.chapter6_interface;

import java.util.function.Consumer;

public class Consumers implements Consumer<String> {

    public Consumers() {

    }

    // This method accepts one value
    // and performs the operation on the given argument
    @Override
    public void accept(String t) {
        System.out.println(t +" Dat Vu, day la Consumer");
    }

    @Override
    public Consumer<String> andThen(Consumer<? super String> after) {
        return Consumer.super.andThen(after);
    }
}
