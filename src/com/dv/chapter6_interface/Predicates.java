package com.dv.chapter6_interface;

import java.util.ArrayList;

public class Predicates {

    public Predicates() {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("Dat Vu pre", 20));
        arrayList.add(new Student("Truong pre", 18));
        arrayList.add(new Student("Truong pre", 20));

        arrayList.removeIf(o -> o.getName().equals("Truong pre"));
        arrayList.forEach(o -> System.out.println(o.getName() + " " + o.getAge()));
    }
}
