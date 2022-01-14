package com.dat.chapter5_inheritance;

public class Employee extends Person {
    private int salary;

    public Employee(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;
        Employee e = (Employee) obj;
        return salary == e.salary;
    }

    @Override
    public void showInfo() {
        System.out.println("Name: " + super.getName());
        System.out.println("Age: " + super.getAge());
        System.out.println("Salary: " + getSalary());
    }
}