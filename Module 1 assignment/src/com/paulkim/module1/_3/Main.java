package com.paulkim.module1._3;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<TwoDShape> ShapeList = new ArrayList<>();
        ShapeList.add(new Triangle(2, 2, 2));
        ShapeList.add(new Circle(2));
    }
}
