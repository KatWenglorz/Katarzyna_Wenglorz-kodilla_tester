package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.StringSources#provideStringForTestingPerson")
    public void testGetBMI(double input, double input2, String expected) {
        Person person = new Person(input, input2);
        String result = person.getBMI();
        assertEquals(expected, result);
    }
}