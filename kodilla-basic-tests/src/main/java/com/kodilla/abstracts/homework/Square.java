package com.kodilla.abstracts.homework;

public class Square extends Shape {
    int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public void getPerimeter() {
        int p = 4 * a;
        System.out.println("The perimeter of this square equals " + p);
    }

    @Override
    public void getSurfaceArea() {
        int P = a * a;
        System.out.println("The surface area of this square equals " + P);
    }
}
