package com.kodilla.execution_model.homework;

import java.util.Objects;

public class Order {
    private double value;
    private String date;
    private String userName;
    public Order(double value, String date, String userName) {
        this.value = value;
        this.date = date;
        this.userName = userName;
    }
    public double getValue() {
        return value;
    }
    public String getDate() {
        return date;
    }
    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "value=" + value +
                ", date='" + date + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.value, value) == 0 && Objects.equals(date, order.date) && Objects.equals(userName, order.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, date, userName);
    }
}
