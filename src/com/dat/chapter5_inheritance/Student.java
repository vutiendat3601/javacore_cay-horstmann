package com.dat.chapter5_inheritance;

public class Student extends Person {
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "A student majoring in " + major;
    }

}
