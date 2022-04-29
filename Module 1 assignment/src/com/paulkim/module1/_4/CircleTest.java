package com.paulkim.module1._4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    @Test
    public void CirclegetAreatest() {
        Circle CircleTest = new Circle(2, Colour.RED);
        assertEquals(12.56, CircleTest.getArea(), 0);
    }
    //tests if the circle method works in the way it's supposed to

}