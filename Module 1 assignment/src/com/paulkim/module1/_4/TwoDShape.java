package com.paulkim.module1._4;

abstract class TwoDShape {
    double width;
    double height;
    Colour colour;

    public TwoDShape(double width, double height) {

    }
    public TwoDShape(Colour colour) {
        this.colour = colour;
    }
    abstract double getArea();

    public void setHeight(double height) {

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

}
