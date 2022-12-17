package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class StringSources {
    static Stream<Arguments> provideStringForTestingPerson() {
        return Stream.of(
                Arguments.of(1.70, 40, "Very severely underweight"),
                Arguments.of(1.70, 45, "Severely underweight"),
                Arguments.of(1.70, 50.0, "Underweight"),
                Arguments.of( 1.70, 60.0, "Normal (healthy weight)"),
                Arguments.of(1.70, 80, "Overweight"),
                Arguments.of(1.70, 100, "Obese Class I (Moderately obese)"),
                Arguments.of(1.70, 110, "Obese Class II (Severely obese)"),
                Arguments.of(1.70, 140, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.70, 170, "Obese Class V (Super Obese)"),
                Arguments.of(1.70, 200, "Obese Class VI (Hyper Obese)")
        );
    }
}
