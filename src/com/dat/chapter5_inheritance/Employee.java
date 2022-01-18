package com.dat.chapter5_inheritance;

import java.time.LocalDate;

// factoring out common functionality by moving it to a superclass 
// is common in object-oriented programming
public class Employee {
    private String name = "";
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, LocalDate hireDay) {
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
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
