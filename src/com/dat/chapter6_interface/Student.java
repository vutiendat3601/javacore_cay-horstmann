package com.dat.chapter6_interface;

public class Student implements Comparable<Student>, Named, Person, Cloneable {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }

    // When override Object.clone(), set the access privilege to public
    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    // resolve conflict default method in 2 intefaces Person, Named
    @Override
    public void welcome() {
        Person.super.welcome();
    }
}
