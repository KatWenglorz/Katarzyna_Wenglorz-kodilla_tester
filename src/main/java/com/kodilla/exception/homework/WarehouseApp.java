package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) {
Warehouse warehouse = new Warehouse(new ArrayList<>());
warehouse.addOrder(new Order("23"));
warehouse.addOrder(new Order("45"));
warehouse.addOrder(new Order("1"));

        try {
            warehouse.getOrder("40");
        } catch (OrderDoesntExistException e) {
            System.out.println("Niestety nie mamy takiego zamówienia. Wpisz poprawny numer.");
        }
    }
}
