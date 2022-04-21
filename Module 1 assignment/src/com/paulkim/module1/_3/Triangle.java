package com.paulkim.module1._3;

public class Triangle extends TwoDShape implements Rotate {
    double side1;
    double side2;
    double side3;
    public Triangle(double width, double height) {

    }
    public Triangle(double side1, double side2, double side3) {

    }
    private double heronsHeight() {
        return (side1 + side2 + side3)/2;
    }
    public double getArea() {
        return width*height;
    }

    @Override
    public void rotate90() {

    }

    @Override
    public void rotate180() {

    }

    @Override
    public void rotate(double degree) {

    }
}
