package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{
    @Override
    public void calculateThePerimeter(int a, int b) {
        int rectanglePerimeter = 2 * a + 2 * b;
        System.out.println("Obwód prostokąta wynosi: " + rectanglePerimeter);
    }

    @Override
    public void calculateTheArea(int c, int d) {
        int rectangleArea = c * d;
        System.out.println("Pole prostokąta wynosi: " + rectangleArea);
    }
}
