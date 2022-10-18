package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a,b);
        boolean correct = ResultChecker.asserEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla tych liczb");
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla tych liczb");
        }
        int subtractResult = calculator.subtract(a,b);
        boolean correct2 = ResultChecker.asserEquals(-3, subtractResult);
        if (correct2) {
            System.out.println("Metoda subtract działa poprawnie dla tych liczb.");
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla tych liczb.");
        }
        int squareResult = calculator.square(a);
        boolean correct3 = ResultChecker.asserEquals(25, squareResult);
        if (correct3) {
            System.out.println("Metoda square działa poprawnie dla tej liczby");
        } else {
            System.out.println("Metoda square nie działa poprawnie dla tej liczby");
        }

    }
}
