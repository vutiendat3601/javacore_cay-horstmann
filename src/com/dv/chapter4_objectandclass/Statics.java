package com.dv.chapter4_objectandclass;

import java.text.NumberFormat;

// static import is importing of static methods and fields
import static java.lang.System.*;


public class Statics {
    public static final String TAG = "DVCompany";

    private static String note;

    static {
        note = "this is Statics class";
        out.println("Day la static import");
    }

    // this is static mothod, use:
    // when a method doesn’t need to access the object state
    // when a method only needs to access static fields of the class
    public static void sayHello() {
        System.out.println("Hello, We are DVCompany");
        System.out.println(note);
    }

    // the NumberFormat don't use constructor instead, because:
    // You can’t give names to constructors
    // When use a constructor, you can’t vary the type of the constructed object.
    public void useFactoryMethod() {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        double x = 0.1;
        System.out.println(currencyFormatter.format(x)); // prints $0.10
        System.out.println(percentFormatter.format(x)); // prints 10%
    }
}
