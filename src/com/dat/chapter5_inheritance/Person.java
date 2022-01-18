package com.dat.chapter5_inheritance;

public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
    }

    public abstract String getDescription();

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person p = (Person) obj;
        return name == p.name;
    }
}
