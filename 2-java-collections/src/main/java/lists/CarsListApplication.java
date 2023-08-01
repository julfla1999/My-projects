package lists;

import arrays.CarUtils;
import interfaces.Audi;
import interfaces.Car;
import interfaces.Opel;
import interfaces.Skoda;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car skoda = new Skoda(120);
        cars.add(skoda);
        cars.add(new Audi(200));
        cars.add(new Opel(90));
        cars.add(new Opel(100));
        cars.add(new Skoda(40));

        for(Car car : cars)
            CarUtils.describeCar(car);

        cars.remove(1);
        cars.remove(skoda);

        System.out.println("---------------------");
        System.out.println("Nowy rozmiar kolekcji: " + cars.size());
        for(Car car : cars)
            CarUtils.describeCar(car);
    }
}
