package com.dat.chapter4_objectandclass;

import java.time.LocalDate;

public class Employee {
    // this is instance fields
    private String name = ""; // this is explicit initialization
    private double salary;

    // initialize block, before constructor
    {
        salary = 0;
    }

    // hireDay always be assigned when object is constructed
    private final LocalDate hireDay;
    public Employee(String name, LocalDate hireDay) {
        this.name = name;
        this.hireDay = hireDay;
    }

    // A constructor is always called with the new operator
    public Employee(String name, double salary, LocalDate hireDay) {
        this(name, hireDay); // call another constructor, this's always in first line
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Hire day: " + hireDay.toString());
        System.out.println("Salary: " + salary);

    }

    public void raiseSalary(float percent) {
        salary *= (1 + percent / 100.0f);
    }
}
