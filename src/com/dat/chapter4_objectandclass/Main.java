package com.dat.chapter4_objectandclass;

public class Main {
    public static void main(String[] args) {
        Student datVu = new Student("Vu Tien Dat", 20, 10);
        datVu.setAddress(46, "Duong so 18", "Ho Chi Minh City");
        // datVu.deleteAddress();
        datVu.showInfo();
    }
}
