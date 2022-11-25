package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(0);
        doRace(ford);
        Toyota toyota = new Toyota(0);
        doRace(toyota);
        Kia kia = new Kia(0);
        doRace(kia);
    }
    private static void doRace(Car car) {
        car.increaseSpeed(3, false);
        car.decreaseSpeed(2);

        System.out.println(car.getSpeed());
        }
    }

