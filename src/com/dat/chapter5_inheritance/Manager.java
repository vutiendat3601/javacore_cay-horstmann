package com.dat.chapter5_inheritance;

public class Manager extends Employee {

    private int bonus;

    public Manager(String name, int age, Nationality nationality, int salary, int bonus) {
        super(name, age, nationality, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total salary: " + (super.getSalary() + bonus));
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;
        Manager m = (Manager) obj;
        return bonus == m.bonus;
    }
}
