package com.kodilla.inheritance;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public void turnOn() {
        System.out.println("Turning on the System...");
    }

    public void turnOff() {
        System.out.println("Turning off the System...");
    }

    public int getYear() {
        return year;
    }

    public void showYearOfProduction() {
        System.out.println("This operating system is from: " + year);
    }
}
