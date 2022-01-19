package com.dat.chapter6_interface;

// Interface in Java is a set of requirements for the classes
// that want to conform to the interface.
public interface InterfaceMethod {
    // Constants in interface is always public static final
    public static final String NAME = "Vu Tien Dat";
    
    // Methods in interface is always public
    public void run();
    
    // In Java SE 8, it is available to add static method in a interface
    public static void show(String name) {
        System.out.println("Your name is " + name);
    }

    // this is default method in interface
    public default void sayHello() {
        System.out.println("This is InterfaceMethod");
    }
}
