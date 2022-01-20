package com.dat.chapter6_interface;

import java.time.DateTimeException;

public class OuterClass {

    private String message;

    public OuterClass(String message) {
        this.message = message;
    }

    public class InnerClass implements Runnable {
        @Override
        public void run() throws DateTimeException {
            System.out.println(OuterClass.this.message);
        }
    }

    public static void main(String[] args) {
        OuterClass o = new OuterClass("Xin chao cac ban");
        Runnable run = o.new InnerClass();
        OuterClass.InnerClass inner = o.new InnerClass();
        run.run();
        inner.run();
    }
}
