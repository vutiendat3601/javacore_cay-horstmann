package com.dat.chapter3_fundamental;

// Enum is actually a class. With number of instance defined inside
public enum Enums {
    SPRING(1), SUMMER(2), FALL(3), WINTER(4);
    private int value;

    private Enums(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
