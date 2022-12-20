package com.kodilla.execution_model.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }
    public List getOrdersFromADateRange(String dateOne, String dateTwo) throws ParseException {
        List<Order> ordersWithDates = new ArrayList<>();
        int index = 0;
        LocalDate date1 = LocalDate.parse(dateOne);
        LocalDate date2 = LocalDate.parse(dateTwo);

        for (index = 0; index < this.orders.size(); index++) {
            LocalDate date = LocalDate.parse(this.orders.get(index).getDate());
            if(date.isAfter(date1) && date.isBefore(date2)) {
                ordersWithDates.add(orders.get(index));
            }
        }
        return ordersWithDates;
    }
    public Order getOrdersFromAValueRange(double max, double min) {
        int index = 0;
        for (index = 0; index < this.orders.size(); index++) {
            if (this.orders.get(index).getValue() >= min && this.orders.get(index).getValue() <= max) {
                return this.orders.get(index);
            }
        }
        return null;
    }
    public int getNumberOfOrders() {
        return this.orders.size();
}
    public double getSumOfValues() {
        double sumOfValues = 0;
        int index = 0;
        for(index = 0; index < this.orders.size(); index++){
            sumOfValues = sumOfValues + this.orders.get(index).getValue();
        }
        return sumOfValues;
    }
}
