package com.paulkim.module1._4;

public class Circle extends TwoDShape {
    public final double PI = 3.14;

    private double radius;

    Circle(double radius) {

    }
    public double getArea() {
        return 2*3.14*width;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "PI=" + PI +
                ", radius=" + radius +
                '}';
    }
}
