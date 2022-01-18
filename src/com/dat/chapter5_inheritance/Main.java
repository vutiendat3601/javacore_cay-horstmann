package com.dat.chapter5_inheritance;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Manager boss = new Manager("DV", 10000, LocalDate.of(2020, 5, 11));
        boss.setBonus(1000);
        // An object variable can refer to multiple actual types
        // is called polymorphism (đa hình)
        Employee[] list = new Employee[3];
        list[0] = boss; // this is polymorphism

        list[1] = new Employee("A", 5000, LocalDate.of(2021, 5, 1));
        list[2] = new Employee("A", 5000, LocalDate.of(2021, 10, 5));

        for (Employee i : list) {
            // Automatically selecting the appropriate method at runtime 
            // is called dynamic binding
            // i.getSalary() is doing a dynamic binding
            System.out.println(i.getName() + i.getSalary());
        }
    }
}