package com.dat.chapter4_objectandclass;

    public class Address {
    private int houseNumber;
    private String city;
    private String street;
    public Address(int houseNumber,String street, String city) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
    }
    public int getHouseNumber() {
        return houseNumber;
    }
    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
    public String getstreet() {
        return street;
    }
    public void setstreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}
