package interfaces;

public class CarRace {
    public static void main(String[] args) {

        Audi audi = new Audi(0);
        doRace(audi);
        Opel opel = new Opel(0);
        doRace(opel);
        Skoda skoda = new Skoda(0);
        doRace(skoda);

    }

    public static void doRace(Car car) {
        car.increaseSpeed();
        car.decreaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.increaseSpeed();
        System.out.println(car.getSpeed());
    }
}
