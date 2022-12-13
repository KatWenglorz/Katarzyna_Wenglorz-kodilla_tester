package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    List<Order> orders;

    public Warehouse(List<Order> orders) {
        this.orders = new ArrayList<Order>();
    }

    public List addOrder (Order order) {
        this.orders.add(order);
        return orders;
    }
    public Order getOrder (String number) throws OrderDoesntExistException {
           return this.orders.stream().filter(order -> order.getNumber().equals(number)).findAny().orElseThrow(() -> new OrderDoesntExistException());
        }
    }
