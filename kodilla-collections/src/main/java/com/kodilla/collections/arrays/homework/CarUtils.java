package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Toyota;

public class CarUtils {
    public static void describeCar (Car car) {
        System.out.println("---------------------------");
        System.out.println("Car kind: " + getCarName(car));
        System.out.println("Initial speed: " + car.getSpeed());
        System.out.println("Increased speed: ");
        car.increaseSpeed(1, true);
        System.out.println("Decreased speed: ");
        car.decreaseSpeed(1);
        System.out.println("Final speed: " + car.getSpeed());
    }

    private static String getCarName (Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Kia)
            return "Kia";
        else if (car instanceof Toyota)
                    return "Toyota";
        else
            return "Unknown car name";
    }
}
