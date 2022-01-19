package com.dat.chapter6_interface;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student[] stdList = new Student[3];
        stdList[0] = new Student("Ha ma", 21);
        stdList[1] = new Student("Dat", 18);
        stdList[2] = new Student("Vy", 19);

        Student aStudent = (Student) stdList[0].clone();
        aStudent.setName("ABC");

        Arrays.sort(stdList);
        for (Student student : stdList) {
            System.out.println(student.getName() + " ");
        }

        String[] strArr = new String[3];
        strArr[0] = "Nguyen Thi Phuong Vy";
        strArr[1] = "Vu Tien Dat";
        strArr[2] = "Vo Thi Hai Yen";
        Arrays.sort(strArr, new MyComparator());
        for (String str : strArr) {
            System.out.println(str);
        }
        Arrays.sort(strArr, (o1, o2) -> {
            return o1.compareTo(o2);
        });
        for (String str : strArr) {
            System.out.println(str);
        }

        // implementing interface by create a Anonymous class
        // and using lambda expression
        FunctionalInterfaces functionalInterfaces = (name, age) -> System.out.println(name + " " + age);
        functionalInterfaces.show("Functinonal Interface: Vu Tien Dat", 20);
        new Predicates();
        new Consumers().accept("Dat Vu");
        say(ConstructorReference::new);
    }

    public static void say(Named named) {
        named.welcome();
    }
}
