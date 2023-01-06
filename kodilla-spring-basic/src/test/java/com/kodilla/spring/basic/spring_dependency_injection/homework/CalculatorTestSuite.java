package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    Calculator bean = context.getBean(Calculator.class);

    @Test
    public void shouldReturnCorrectValue() {
        Display bean = context.getBean(Display.class);
        String displayedResult = bean.display(22);
        Assertions.assertNotNull(displayedResult);
    }
    @Test
    public void shouldReturnCorrectAddResult() {
        String result = bean.add(13, 12);
        Assertions.assertEquals("The result is: 25.0", result);
    }
    @Test
    public void shouldReturnCorrectSubtractResult() {
        String result = bean.subtract(13,12);
        Assertions.assertEquals("The result is: 1.0", result);
    }
    @Test
    public void shouldReturnCorrectMultiplyResult() {
        String result = bean.multiply(13,12);
        Assertions.assertEquals("The result is: 156.0", result);
    }
    @Test
    public void shouldReturnCorrectDivideResult() {
        String result = bean.divide(12,4);
        Assertions.assertEquals("The result is: 3.0", result);
    }
    @Test
    public void shouldReturnErrorWhenDivisorIsZero() {
        String result = bean.divide(12, 0);
        Assertions.assertEquals("Error", result);
    }
}
