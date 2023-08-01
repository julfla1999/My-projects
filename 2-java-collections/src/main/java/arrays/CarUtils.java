package arrays;

import interfaces.Audi;
import interfaces.Car;
import interfaces.Opel;
import interfaces.Skoda;


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
