package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Kia;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Kia> cars = new ArrayList<>();
        Kia kia1 = new Kia(10);

        cars.add(new Kia(0));
        cars.add(kia1);
        cars.add(new Kia(20));
        cars.add(new Kia(30));

        cars.remove(2);
        cars.remove(kia1);

        System.out.println(cars.size());

        CarUtils carUtils = new CarUtils();
        for (Kia kia : cars) {
            carUtils.describeCar(kia);
        }
    }
}
