package com.dat.chapter5_inheritance;

import com.dat.chapter4_objectandclass.Address;

public class Student extends Person {
    private int id;
    private Address address;

    public Student(String name, int age, Nationality nationality, int id) {
        super(name, age, nationality);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        if (address != null)
            return address.getHouseNumber() + " "
                    + address.getstreet() + ", " + address.getCity();
        return null;
    }

    public void setAddress(int houseNumber, String street, String city) {
        address = new Address(houseNumber, street, city);
    }

    public void showInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("ID: " + id);
        if (address != null)
            System.out.println(getAddress());
    }

    public void deleteAddress() {
        address = null;
    }
}
