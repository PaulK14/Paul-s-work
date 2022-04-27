package com.paulkim.module1._4;

public class Triangle extends TwoDShape implements Rotate {
    double side1;
    double side2;
    double side3;
    public Triangle(double width, double height, Colour colour) {
        super(colour);

    }
    public Triangle(double side1, double side2, double side3,Colour colour) {
        super(colour);

    }
    private double heronsHeight() {
        return (side1 + side2 + side3)/2;
    }
//get the area of the triangle using Heron's formula (using 3 sides instead of with & height)
    public double getArea() {
        return width*height;
    }
//get the area of the triangle
    @Override
    public void rotate90() {
//rotate 90 degrees
    }

    @Override
    public void rotate180() {
//rotate by 180 degrees
    }

    @Override
    public void rotate(double degree) {
//method to rotate by a chosen degree
    }
}
