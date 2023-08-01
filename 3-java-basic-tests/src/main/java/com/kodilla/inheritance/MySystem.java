package com.kodilla.inheritance;

public class MySystem {
    public static void main(String[] args) {

        WindowsXP windowsXp = new WindowsXP(2001);
        windowsXp.turnOn();
        windowsXp.showYearOfProduction();
        windowsXp.turnOff();

        WindowsVista windowsVista = new WindowsVista(2007);
        windowsVista.turnOn();
        windowsVista.showYearOfProduction();
        windowsVista.turnOff();

    }
}
