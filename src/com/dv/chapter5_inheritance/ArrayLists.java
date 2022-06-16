package com.dv.chapter5_inheritance;

import java.time.LocalDate;
import java.util.ArrayList;

public class ArrayLists {

    public ArrayLists() {
        ArrayList<Person> list = new ArrayList<>(); // diamond syntax
        list.ensureCapacity(10); // improve performance
        Person x = new Employee("Dat Vu", 6500000, LocalDate.of(2020, 5, 11));
        Person y = new Student("Dat Vu", "Information Technology");
        list.add(x);
        list.add(y);
        list.set(0, y); // equipment a[i] = y. Do not use when size < i
        System.out.println(list.get(0));
        list.trimToSize(); // improve performance
        System.out.println("We have " + list.size() + " persons");
        list.forEach(o -> System.out.println(o.getName() + " " + o.getDescription()));
        list.remove(1);
    }
}
