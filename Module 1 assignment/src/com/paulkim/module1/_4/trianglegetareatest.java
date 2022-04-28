package com.paulkim.module1._4;

import org.junit.Test;

import static org.junit.Assert.*;

public class trianglegetareatest {
    @Test public void trianglebutarea() {
        Triangle testTriangle = new Triangle(2,4, Colour.BLUE);
        assertEquals(4, testTriangle.getArea(), 0);

    }
    @Test public void trianglebutheronsheight() {
        Triangle testTriangle2 = new Triangle(2, 2, 2, Colour.RED);
        assertEquals(3, testTriangle2.heronsHeighttest(), 0);
    }
}