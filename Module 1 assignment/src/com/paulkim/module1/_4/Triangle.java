package com.paulkim.module1._4;

public class Triangle extends TwoDShape implements Rotate {
    double side1;
    double side2;
    double side3;
    public Triangle(double width, double height, Colour colour) {
        super(colour);
        this.width = width;
        this.height = height;


    }
    public Triangle(double side1, double side2, double side3,Colour colour) {
        super(colour);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }
    private double heronsHeight() {
        return (side1 + side2 + side3)/2;
    }
//get the area of the triangle using Heron's formula (using 3 sides instead of with & height)

    public double heronsHeighttest() {
        return (side1 + side2 + side3)/2;
    }
    public double getArea() {
        return width*height/2;
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
