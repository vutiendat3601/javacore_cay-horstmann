package com.dat.chapter5_inheritance;

import java.time.LocalDate;

// factoring out common functionality by moving it to a superclass 
// is common in object-oriented programming
public class Employee extends Person {
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, LocalDate hireDay) {
        super(name);
        this.salary = salary;
        this.hireDay = hireDay;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Hire day: " + hireDay.toString());
        System.out.println("Salary: " + salary);
    }

    public void raiseSalary(float percent) {
        salary *= (1 + percent / 100.0f);
    }

    @Override
    public String getDescription() {
        return "An employee have salary: " + salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;
        Employee e = (Employee) obj;
        return salary == e.salary && hireDay.toEpochDay() == e.hireDay.toEpochDay();
    }
}
