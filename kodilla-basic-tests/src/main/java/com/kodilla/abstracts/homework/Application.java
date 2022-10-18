package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Shape square = new Square(9);
        square.getPerimeter();
        square.getSurfaceArea();

        Shape rectangle = new Rectangle(12,18);
        rectangle.getPerimeter();
        rectangle.getSurfaceArea();

        Shape rhomboid = new Rhomboid(5,7);
        rhomboid.getPerimeter();
        rhomboid.getSurfaceArea();
    }
}
