package com.kodilla.abstracts.homework;

public class Parallelogram extends Shape{
    @Override
    public void calculateThePerimeter(int a, int b) {
        int parallelogramPerimeter = 2 * a + 2 * b;
        System.out.println("Obwód równoległoboku wynosi: " + parallelogramPerimeter);
    }

    @Override
    public void calculateTheArea(int c, int d) {
        int parallelogramArea = c * d;
        System.out.println("Pole równoległoboku wynosi: " + parallelogramArea);
    }
}
