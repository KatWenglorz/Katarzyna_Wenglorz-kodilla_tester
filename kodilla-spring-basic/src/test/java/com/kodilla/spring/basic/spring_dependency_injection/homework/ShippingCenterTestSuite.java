package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");

    @Test
    public void shouldReturnFalseIfWeightIsOver30() {
    DeliveryService bean = context.getBean(DeliveryService.class);
    Boolean isPackageDelivered = bean.deliverPackage("Kraków, Armii Krajowej 80/22", 40.0);
    Assertions.assertFalse(isPackageDelivered);
    }
    @Test
    public void shouldReturnTrueIfWeightIsUnderOrEqual30() {
        DeliveryService bean = context.getBean(DeliveryService.class);
        Boolean isPackageDelivered = bean.deliverPackage("Kraków, Armii Krajowej 80/22", 20.0);
        Assertions.assertTrue(isPackageDelivered);
    }
    @Test
    public void shouldReturnSuccessMessage() {
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Kraków, Armii Krajowej 80/22", 20);
        Assertions.assertEquals("Package delivered to: Kraków, Armii Krajowej 80/22", message);
    }
    @Test
    public void shouldReturnFailMessage() {
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Kraków, Armii Krajowej 80/22", 40);
        Assertions.assertEquals("Package not delivered to: Kraków, Armii Krajowej 80/22", message);
    }
}