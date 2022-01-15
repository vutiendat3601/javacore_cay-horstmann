package com.dat.chapter5_inheritance;

import com.dat.chapter4_objectandclass.Address;

public class Executive extends Manager {
    private Address address;

    public Executive(String name, int age, Nationality nationality, int salary, int bonus) {
        super(name, age, nationality, salary, bonus);
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

    @Override
    public void showInfo() {
        super.showInfo();
        if (address != null) {
            System.out.println(getAddress());
        }
    }
}
