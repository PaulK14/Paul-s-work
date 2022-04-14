package com.paulkim.module1._2;

abstract class TwoDShape {
    double width;
    double height;
    public TwoDShape(double width, double height) {

    }
    public TwoDShape() {

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
