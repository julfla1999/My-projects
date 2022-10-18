package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void getPerimeter() {
        int p = 2 * a + 2 * b;
        System.out.println("The perimeter of this rectangle equals " + p);
    }

    @Override
    public void getSurfaceArea() {
        int P = a * b;
        System.out.println("The surface area of this rectangle equals " + P);
    }
}
