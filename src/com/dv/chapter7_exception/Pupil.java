package com.dv.chapter7_exception;

public class Pupil extends Student {

    public Pupil(String name) {
        super(name);
    }

    // subclass methods exception can't be more general than superclass method
    // exception
    @Override
    public String getName() throws WrongNameException {
        return super.getName();
    }

}
