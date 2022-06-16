package com.dv.chapter7_exception;

public class Student {
    private String name;

    public String getName() throws WrongNameException {
        if (name.equals(""))
            throw new NoNameException("Ten bi rong");
        else if (0 < name.length() && name.length() < 3)
            throw new WrongNameException("Ten sai cu phap");
        return name;
    }

    public Student(String name) {
        this.name = name;
    }

    public void showName() throws Throwable {
        try {
            System.out.println(getName());
        } catch (NoNameException e) {
            Throwable x = new WrongNameException(e.getMessage());
            x.initCause(e);
            throw x;
        }
    }

    public static void main(String[] args) {
        Student student = new Student("");
        try {
            student.showName();
        } catch (Throwable e) {
            Throwable x = e.getCause();
            System.out.println(x.getClass().getName());
        }

    }
}
