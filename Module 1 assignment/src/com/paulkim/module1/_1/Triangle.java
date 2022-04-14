package com.paulkim.module1._1;

public class Triangle extends TwoDShape{
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
}
