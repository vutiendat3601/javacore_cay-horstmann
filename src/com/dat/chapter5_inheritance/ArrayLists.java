package com.dat.chapter5_inheritance;

import java.time.LocalDate;
import java.util.ArrayList;

public class ArrayLists {
    
    public ArrayLists() {
        ArrayList<Person> list = new ArrayList<>(); // diamond syntax
        Person x = new Employee("Dat Vu", 6500000, LocalDate.of(2020, 5, 11));
        Person y = new Student("Dat Vu", "Information Technology");
        list.add(x);
        list.add(y);
        list.forEach(o -> System.out.println(o.getName() + " " + o.getDescription()));
    }
}
