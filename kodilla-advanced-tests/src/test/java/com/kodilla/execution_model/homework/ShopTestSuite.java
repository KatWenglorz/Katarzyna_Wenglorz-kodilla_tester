package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.text.ParseException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop shop = new Shop();

    Order one = new Order(10.00, "2022-12-10", "pablo");
    Order two = new Order(5.60, "2022-12-11", "mark");
    Order three = new Order(45.40, "2022-12-11", "ann");
    Order four = new Order(67.80, "2022-12-12", "mike");
    Order five = new Order(45.20, "2022-12-13", "rachel");

    @Test
    public void shouldAddOrderToShop() {
        //when
        int result = shop.getNumberOfOrders();
        //then
        assertEquals(5, result);
    }
    @Test
    public void shouldGetOrdersFromADateRange() throws ParseException {
        //when
        List<Order> result1 = shop.getOrdersFromADateRange("2022-12-11", "2022-12-13");
        //then
        assertEquals(new Order(67.8, "2022-12-12", "mike"), result1.get(0));
    }
    @Test
    public void shouldGetOrdersFromAValueRange() {
        //when
        Order result2 = shop.getOrdersFromAValueRange(100.0, 50.0);
        //then
        assertEquals(67.80, result2.getValue(), 0.01);
        assertEquals("2022-12-12", result2.getDate());
        assertEquals("mike", result2.getUserName());
    }
    @Test
    public void shouldReturnNullWhenPassingValueOutOfRange() {
        //when
        Order result3 = shop.getOrdersFromAValueRange(200.0, 100.0);
        //then
        assertNull(result3);
    }
    @Test
    public void shouldGetNumberOfOrders() {
        //when
        int result4 = shop.getNumberOfOrders();
        //then
        assertEquals(5, result4);
    }
    @Test
    public void shouldGetSumOfValues() {
        //when
        double result5 = shop.getSumOfValues();
        //then
        assertEquals(174, result5);
    }

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(one);
        shop.addOrder(two);
        shop.addOrder(three);
        shop.addOrder(four);
        shop.addOrder(five);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

}