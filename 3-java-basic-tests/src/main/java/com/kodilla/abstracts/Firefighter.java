package com.kodilla.abstracts;

public class Firefighter extends Job {

    public Firefighter() {

        super(7000, " protecting citizens during emergencies, extinguishing fires.");
    }

    @Override
    public void showResponsibilities() {
        System.out.println(this.responsibilities);
    }
}
