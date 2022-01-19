package com.dat.chapter4_objectandclass;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

public class Dates {

    public Dates() {
        // useDate();
        // useLocalDate();
        showCalendar();
    }

    // the time in Date class is represented by the number of milliseconds
    public void useDate() {
        Date date = new Date();
        System.out.println(date);
    }

    // LocalDate has no mutator method
    public void useLocalDate() {
        LocalDate birthDay = LocalDate.of(2021, 6, 3);
        birthDay.plusDays(1000); // won't work
        int day = birthDay.getDayOfMonth();
        int month = birthDay.getMonthValue();
        int year = birthDay.getYear();
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
    }

    // use LocalDate
    public void showCalendar() {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        date = date.minusDays(today - 1); // first day
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int firsDayOfWeek = dayOfWeek.getValue();
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < firsDayOfWeek; i++)
            System.out.printf("%4s", "");
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }
    }
}