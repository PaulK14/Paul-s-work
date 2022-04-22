package com.paulkim.module1._4;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<TwoDShape> ShapeList = new ArrayList<>();
        ShapeList.add(new Triangle(2, 2, 2, Colour.GREEN));
        ShapeList.add(new Circle(2, Colour.RED));
    }
}
