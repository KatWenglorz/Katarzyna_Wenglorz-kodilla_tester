package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Shape square = new Square();
        square.calculateTheArea(10, 10);
        square.calculateThePerimeter(10, 10);

        Shape rectangle = new Rectangle();
        rectangle.calculateThePerimeter(10, 20);
        rectangle.calculateTheArea(10, 20);

        Shape parallelogram = new Parallelogram();
        parallelogram.calculateTheArea(12, 22);
        parallelogram.calculateThePerimeter(12, 10);
    }
}
