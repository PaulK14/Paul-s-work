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
    //set the colour of the TwoDShape
    abstract double getArea();
    //Have a method named getArea but set the parameters of it in a different subclass

    public void setHeight(double height) {
//set the height of the TwoDShape
    }

    public double getWidth() {
        return width;
    }
//get the width that was set for the TwoDShape
    public void setWidth(double width) {
        this.width = width;
    }
//set the desired width of the TwoDShape
    public double getHeight() {
        return height;
    }

}
