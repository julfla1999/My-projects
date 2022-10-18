package com.kodilla.inheritance.homework;

public class WindowsVista extends OperatingSystem {

    public WindowsVista(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on Windows Vista...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off Windows Vista...");
    }
}
