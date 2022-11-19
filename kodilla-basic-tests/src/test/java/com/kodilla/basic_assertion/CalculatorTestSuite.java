package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 8;
        double sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult, 0.01);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 8;
        double subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult, 0.01);
    }

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        double c = -3;
        double d = 2;
        double squareResult = calculator.square(c, d);
        assertEquals(9, squareResult, 0.01);
    }

    @Test
    public void testSquare1() {
        Calculator calculator = new Calculator();
        double c = 0;
        double d = 2;
        double squareResult = calculator.square(c, d);
        assertEquals(0, squareResult, 0.01);
    }

    @Test
    public void testSquare2() {
        Calculator calculator = new Calculator();
        double c = 3;
        double d = 2;
        double squareResult = calculator.square(c, d);
        assertEquals(9, squareResult, 0.01);
    }
}
