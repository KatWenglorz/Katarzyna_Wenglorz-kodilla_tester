package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{
    private int speed;

    public Ford(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed(int number) {
        int sum = speed;
        for (int i = 0; i < number; i++) {
            sum = 20 + sum;
        }
        speed = sum;
        System.out.println(speed);
    }

    @Override
    public void decreaseSpeed(int number) {
        int sum = speed;
        for (int i = 0; i < number; i++) {
            sum = sum - 20;
        }
        if (sum < 0) {
            sum = 0;
        }
        speed = sum;
        System.out.println(speed);
    }
}
