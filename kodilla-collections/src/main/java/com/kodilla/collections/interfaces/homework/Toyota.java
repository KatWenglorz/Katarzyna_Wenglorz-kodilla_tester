package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car{
    private int speed;

    public Toyota(int speed) {
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
            sum = 30 + sum;
        }
        speed = sum;
        System.out.println(speed);
    }

    @Override
    public void decreaseSpeed(int number) {
        int sum = speed;
        for (int i = 0; i < number; i++) {
            sum = sum - 30;
            }
        if (sum < 0) {
            sum = 0;
        }
        speed = sum;
        System.out.println(speed);
    }
}
