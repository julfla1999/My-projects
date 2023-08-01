package com.kodilla.abstracts;

public class Teacher extends Job {

    public Teacher() {
        super(4000, " teaching students, planning and preparing lessons, marking students work.");
    }

    @Override
    public void showResponsibilities() {
        System.out.println(this.responsibilities);
    }
}
