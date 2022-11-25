package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarsApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

    Car[] cars = new Car[RANDOM.nextInt(15) +1];
    for (int n = 0; n < cars.length; n++)
        cars[n] = drawCar();
    for (Car car : cars)
        CarUtils.describeCar(car);
    }
    public static Car drawCar() {
        int carKind = RANDOM.nextInt(3);
        if (carKind == 0)
            return new Ford(0);
        else if (carKind == 1)
            return new Kia(0);
        else
            return new Toyota(0);
    }
}
