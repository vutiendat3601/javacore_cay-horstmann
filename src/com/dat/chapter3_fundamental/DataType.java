package com.dat.chapter3_fundamental;

public class DataType {

    public DataType() {
        int binary = 0b1010;
        System.out.println(binary);
        int octal = 074;
        System.out.println(octal);
        System.out.println("Byte (1 byte): " + Byte.MIN_VALUE + " *** " + Byte.MAX_VALUE);
        System.out.println("Short (2 bytes): " + Short.MIN_VALUE + " *** " + Short.MAX_VALUE);
        System.out.println("Integer (4 bytes): " + Integer.MIN_VALUE + " *** " + Integer.MAX_VALUE);
        System.out.println("Long (8 bytes): " + Long.MIN_VALUE + " *** " + Long.MAX_VALUE);
        System.out.println("******************************************");
        System.out.println("Float (4 bytes): " + Float.MIN_VALUE + " *** " + Float.MAX_VALUE);
        System.out.println("Double (8 bytes): " + Double.MIN_VALUE + " *** " + Double.MAX_VALUE);
    }
}
