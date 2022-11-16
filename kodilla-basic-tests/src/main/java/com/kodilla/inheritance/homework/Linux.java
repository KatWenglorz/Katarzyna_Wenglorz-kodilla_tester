package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {
    public Linux(int year) {
        super(year);
    }
    @Override
    public void turnOff() {
        System.out.println("System wasn't turned off.");
    }
}
