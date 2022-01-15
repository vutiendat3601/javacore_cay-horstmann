package com.dat.chapter5_inheritance;

public class Employee extends Person {
    private int salary;

    public Employee(String name, int age, Nationality nationality, int salary) {
        super(name, age, nationality);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        // if (!(obj instanceof Employee))
        if (getClass() != obj.getClass())
            return false;
        Employee e = (Employee) obj;
        return salary == e.salary;
    }

    @Override
    public void showInfo() {
        System.out.println("Name: " + super.getName());
        System.out.println("Age: " + super.getAge());
        System.out.println("Nationality: " + super.getNationality());
        System.out.println("Salary: " + getSalary());
    }
}