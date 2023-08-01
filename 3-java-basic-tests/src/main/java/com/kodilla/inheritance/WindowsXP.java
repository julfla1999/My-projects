package com.kodilla.inheritance;

public class WindowsXP extends OperatingSystem {

    public WindowsXP(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on Windows XP...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off Windows XP...");
    }
}
