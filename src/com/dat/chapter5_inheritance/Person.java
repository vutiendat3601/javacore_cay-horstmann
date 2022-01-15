package com.dat.chapter5_inheritance;

public abstract class Person {
    private String name;
    private int age;
    private Nationality nationality;

    public Person(String name, int age, Nationality nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
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

    public String getNationality() {
        return nationality.getName();
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public abstract void showInfo();
}
