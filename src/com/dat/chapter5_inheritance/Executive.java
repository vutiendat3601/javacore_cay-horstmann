package com.dat.chapter5_inheritance;

import com.dat.chapter4_objectandclass.Address;

public class Executive extends Manager {
    private Address address;

    public Executive(String name, int age, int id, int salary, int bonus) {
        super(name, age, id, salary, bonus);
    }

    public void setAddress(int houseNumber, String street, String city) {
        this.address = new Address(houseNumber, street, city);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        if (this.address != null) {
            System.out.println("Address: " + this.address.getHouseNumber() + " "
                    + this.address.getstreet() + ", " + this.address.getCity());
        }
    }
}
