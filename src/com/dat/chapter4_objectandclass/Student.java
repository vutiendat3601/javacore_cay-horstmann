package com.dat.chapter4_objectandclass;

public class Student {
    private String name;
    private int age;
    private int id;
    private Address address;

    public Student(){
        super();
    }

    public Student(String name, int age) {
        this();
        this.name = name;
        this.age = age;
        id = 0;
    }

    public Student(String name, int age, int id) {
        this(name, age);
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(int houseNumber, String street, String city) {
        address = new Address(houseNumber, street, city);
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
        if (address != null)
            System.out.println("Address: " + address.getHouseNumber() + " "
                    + address.getstreet() + ", " + address.getCity());
    }

    public void deleteAddress() {
        address = null;
    }
}
