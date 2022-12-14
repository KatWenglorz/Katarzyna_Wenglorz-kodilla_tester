package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    UserValidator userValidator = new UserValidator();
    StringValidator validator = new StringValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Kate", "KATE", "Kat0", "kat_wen", "kat.wen", "kat-wen"})
    public void shouldReturnTrueWhenUsernameIsCorrect(String username) {
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"ka", "kate>", "ka:te"})
    public void shouldReturnFalseWhenUsernameIsNotCorrect(String username) {
        boolean result1 = userValidator.validateUsername(username);
        assertFalse(result1);
    }

    @ParameterizedTest
    @ValueSource(strings = {"fajny@email.com", "FAJNY@123.pl"})
    public void shouldReturnTrueWhenEmailIsCorrect(String email) {
        boolean result2 = userValidator.validateEmail(email);
        assertTrue(result2);
    }

    @ParameterizedTest
    @ValueSource(strings = {"fajny", "fajny@email", "@email.com", "fajny.email.com", "fajny@email.cooooom"})
    public void shouldReturnFalseWhenEmailIsNotCorrect(String email) {
        boolean result3 = userValidator.validateEmail(email);
        assertFalse(result3);
    }
    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringUsernameIsEmpty(String username) {
        assertTrue(validator.isBlank(username));
    }
    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringEmailIsEmpty(String email) {
        assertTrue(validator.isBlank(email));
    }
}