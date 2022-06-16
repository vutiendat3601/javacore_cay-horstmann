package com.dv.chapter5_inheritance;

import java.time.LocalDate;

// inheritance hierarchy
// inheritance chain
// Manager is-a Employee
public class Manager extends Employee {
    private double bonus;

    // super is a keyword to initialize private attribute at superclass
    public Manager(String name, double salary, LocalDate hireDay) {
        super(name, salary, hireDay);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // super only is only a keyword to invoke the superclass method
    // in the other hand, super is different from this refference
    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
}
