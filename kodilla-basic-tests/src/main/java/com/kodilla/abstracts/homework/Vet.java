package com.kodilla.abstracts.homework;

public class Vet extends Job {

    public Vet() {
        super(5500, " examining animals to assess their health and diagnose problems, treating, performing surgeries and prescribing medication.");
    }

    @Override
    public void showResponsibilities() {
        System.out.println(this.responsibilities);
    }
}
