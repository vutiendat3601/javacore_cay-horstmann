package com.dv.chapter4_objectandclass;

public class MethodParameter {

    // in Java, always passed by value
    // a method cannot modify a parameter of a primitive type
    // a method cannot make an object parameter refer to a new object.
    // a method can change the state of an object parameter.
    public static void Swap(Employee a, Employee b) {
        a.raiseSalary(10); // this is change state
        a.showInfo();
        Employee temp = a;
        a = b;
        b = temp;
        // the goal of this Swap method won't work
    }
}
