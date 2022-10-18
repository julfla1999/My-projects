package com.kodilla.abstracts.homework;

public class Rhomboid extends Shape {
    int a;
    int h;

    public Rhomboid(int a,int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public void getPerimeter() {
        int p = 4 * a;
        System.out.println("The perimeter of this rhomboid equals " + p);
    }

    @Override
    public void getSurfaceArea() {
        double P = a * h;
        System.out.println("The surface area of this rhomboid equals " + P);
    }
}
