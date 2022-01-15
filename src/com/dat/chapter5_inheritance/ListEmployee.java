package com.dat.chapter5_inheritance;

import java.util.ArrayList;

public class ListEmployee {
    private ArrayList<Employee> list;

    public static void main(String[] args) {
        ListEmployee list = new ListEmployee();
        Employee e1 = new Employee("Dat Vu", 20, Nationality.VN, 5);
        Employee e2 = new Manager("Dat", 20, Nationality.USA, 3, 1);
        list.addEmployee(e1);
        list.addEmployee(e2);
        list.searchByName("Dat Vu");
    }

    public ListEmployee() {
        this.list = new ArrayList<Employee>();
    }

    public void addEmployee(Employee x) {
        list.add(x);
    }

    public void showList() {
        System.out.println(list.toString());
    }

    public void searchByName(String name) {
        list.stream().filter(o -> o.getName().equals(name)).forEach(em -> em.showInfo());
    }
}
