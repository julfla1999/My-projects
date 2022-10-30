package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Skoda;

import java.util.Random;

public class CarsApplication {
    private static final Random random = new Random();

    public static void main(String[] args) {
        Car[] cars = new Car[random.nextInt(15) + 1];
        for ( int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car: cars)
            CarUtils.describeCar(car);
    }

    private static int getRandomSpeed(Random random) {

        return random.nextInt(150 + 1 - 80) + 80;
    }
    private static Car drawCar() {
        int drawnCareMake = random.nextInt(3);
        int speed = getRandomSpeed(random);
        if (drawnCareMake == 0)
            return new Audi(speed);
        else if (drawnCareMake == 1)
            return new Opel(speed);
        else
            return new Skoda(speed);
    }
}
