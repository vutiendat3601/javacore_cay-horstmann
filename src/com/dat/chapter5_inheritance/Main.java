package com.dat.chapter5_inheritance;

public class Main {
    public static void main(String[] args) {
        Person[] list = new Person[4];

        list[0] = new Employee("Nguyen Van A", 35, 15);
        list[1] = new Manager("Tran Van B", 23, 40, 10);

        Executive dat = new Executive("Dat Vu", 20, 20, 5);
        dat.setAddress(46, "Quoc lo 14", "Dak Nong Province");
        list[2] = dat;

        Student vy = new Student("Nguyen Thi Phuong Vy", 18, 10);
        vy.setAddress(10, "Duong so 1", "An Giang Province");
        list[3] = vy;

        for (Person i : list) {
            i.showInfo();
            System.out.println();
        }
    }
}
