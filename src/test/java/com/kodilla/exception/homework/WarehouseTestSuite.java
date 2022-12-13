package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {
    @Test
    public void testGetOrder_withException() {
        //given
        Warehouse warehouse = new Warehouse(new ArrayList<>());
        warehouse.addOrder(new Order("23"));
        warehouse.addOrder(new Order("45"));
        //when
        //then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("10"));
    }

}