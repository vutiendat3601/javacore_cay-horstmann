package com.dat.chapter5_inheritance;

public class Manager extends Employee {

    private int bonus;

    public Manager(String name, int age, int id, int salary, int bonus) {
        super(name, age, id, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return this.bonus;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + this.bonus;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Bonus: " + this.bonus);
        System.out.println("Total salary: " + getSalary());
    }

    // @Override
    // public boolean equals(Object obj) {
    // if (!(super.equals(obj)))
    // return false;
    // Manager manager = (Manager) obj;
    // return bonus == manager.bonus;
    // }
}
