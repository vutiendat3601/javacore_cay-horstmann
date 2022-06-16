package com.dv.chapter4_objectandclass;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        testEmployee();
    }

    public static void testEmployee() {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("e1", 500, LocalDate.of(2021, 1, 18));
        staff[1] = new Employee("e2", 600, LocalDate.of(2020, 7, 6));
        staff[2] = new Employee("e3", 1000, LocalDate.of(2020, 1, 5));
        for (Employee e : staff) {
            if (e.getName().equals("e2"))
                continue;

            // e is a implicit parameter
            // 5 is a explicit parameter
            e.raiseSalary(5);
        }
        for (Employee e : staff)
            e.showInfo();
    }
}
