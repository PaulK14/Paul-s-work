package com.paulkim.module1._4;

public class Circle extends TwoDShape {
    public final double PI = 3.14;

    private double radius;
    public double Radius;

    Circle(double radius, Colour colour) {
        super(colour);
        this.radius = radius;


    }
    //above is for stating the properties of the circle
    public double getArea() {
        return 2*3.14*radius;
    }
//this is the operation required to find the area of the circle
    @Override
    public String toString() {
        return "Circle{" +
                "PI=" + PI +
                ", radius=" + radius +
                '}';
    }
}
//the class for properties of a circle