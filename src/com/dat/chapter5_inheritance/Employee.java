package com.dat.chapter5_inheritance;


public class Employee {
    private String name;
    private int age;
    private int id;
    private int salary;

    public Employee(String name, int age, int id, int salary) {
        super();
        this.name = name;
        this.age = age;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void showInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("ID: " + this.id);
        System.out.println("Salary: " + this.salary);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        // khong dung vi x.equals(obj) != obj.equals(x) x va obj khac class
        // dung getClass de thay the
        if (!(obj instanceof Employee))
            return false;
        // if (getClass() != obj.getClass())
        // return false;

        Employee employee = (Employee) obj;
        return name.equals(employee.name) && age == employee.age &&
                id == employee.id && salary == employee.salary;
    }
}