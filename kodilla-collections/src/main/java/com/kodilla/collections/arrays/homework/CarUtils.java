package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Skoda;


public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("---------------------");
        System.out.println("Car make: " + getCarMake(car));
        System.out.println("Car speed: " + car.getSpeed());
    }
    private static String getCarMake(Car car) {
        if (car instanceof Audi)
            return "Audi";
        if (car instanceof Opel)
            return "Opel";
        if (car instanceof Skoda)
            return "Skoda";
        else
            return "Unknown car make";
    }
}
