package com.kodilla.abstracts.homework;

public class Square extends Shape{
    @Override
    public void calculateThePerimeter(int a, int b) {
        int squarePerimeter = 4 * a;
        System.out.println("Obwód kwadratu wynosi: " + squarePerimeter);
    }

    @Override
    public void calculateTheArea(int c, int d) {
        int squareArea = c * d;
        System.out.println("Pole kwadratu wynosi: " + squareArea);
    }
}
