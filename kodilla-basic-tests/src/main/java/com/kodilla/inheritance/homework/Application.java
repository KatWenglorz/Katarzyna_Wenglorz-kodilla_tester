package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args) {
    Windows windows = new Windows(2021);
    windows.turnOn();
    windows.turnOff();
    windows.displayYear();

    Linux linux = new Linux(2022);
    linux.turnOn();
    linux.turnOff();
    linux.displayYear();
    }
}
