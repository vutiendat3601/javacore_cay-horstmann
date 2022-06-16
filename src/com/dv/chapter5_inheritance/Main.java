package com.dv.chapter5_inheritance;

import java.time.LocalDate;

// final class will don't have subclass
// all methods in a final class are automatically final method
// final method is can't be override
public final class Main {
    public static void main(String[] args) {
        // Manager boss = new Manager("DV", 10000, LocalDate.of(2020, 5, 11));
        // boss.setBonus(1000);
        // // An object variable can refer to multiple actual types
        // // is called polymorphism (đa hình)
        // Person[] list = new Person[3];
        // list[0] = boss; // this is polymorphism

        // list[1] = new Employee("A", 5000, LocalDate.of(2021, 5, 1));
        // list[2] = new Student("Dat Vu", "Software Engineering");

        // // In Java, object variables are polymorphic
        // for (Person i : list) {
        //     // Automatically selecting the appropriate method at runtime
        //     // is called dynamic binding
        //     // i.getSalary() is doing a dynamic binding
        //     System.out.println(i.getName() + " " + i.getDescription());
        // }
        // test1();

        // Employee e = new Employee("name", 10, LocalDate.of(2020, 2, 1));
        // Employee e1 = new Employee("name", 10, LocalDate.of(2020, 2, 1));
        // System.out.println(e.equals(e1));
        new ArrayLists();
    }

    public static void test1() {
        Manager[] m = new Manager[3];
        m[0] = new Manager("sString", 10, LocalDate.now());
        Employee[] e = m;
        // e[0] = new Employee("s", 10, LocalDate.now()); // ArrayStoreException
        // m[0].setBonus(10);
        e[0].showInfo();
    }
}