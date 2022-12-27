package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    @ParameterizedTest
    @CsvFileSource(resources = "/correctNumbers.csv", numLinesToSkip = 1)
    public void testHowManyWins(String one, String two, String three, String four,String five, String six) throws InvalidNumbersException{
        //given
       Set<Integer> userNumbers = new HashSet<Integer>(Set.of(
               Integer.parseInt(one),
               Integer.parseInt(two),
               Integer.parseInt(three),
               Integer.parseInt(four),
               Integer.parseInt(five),
               Integer.parseInt(six)));
        GamblingMachine gamblingMachine = new GamblingMachine();
        //when
        //then
        gamblingMachine.howManyWins(userNumbers);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/invalidNumbersWithCommas.csv", numLinesToSkip = 1)
    public void testHowManyWins1_withException(String one, String two, String three, String four,String five, String six) throws InvalidNumbersException {
        //given
        Set<Integer> userNumbers1 = new HashSet<Integer>(Set.of(
                Integer.parseInt(one),
                Integer.parseInt(two),
                Integer.parseInt(three),
                Integer.parseInt(four),
                Integer.parseInt(five),
                Integer.parseInt(six)));
        GamblingMachine gamblingMachine = new GamblingMachine();
        //when
        //then
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers1));
    }
   @ParameterizedTest
    @CsvFileSource(resources = "/invalidNumbers.csv")
    public void testHowManyWins_withException(String line1) {
        //given
        Set<Integer> userNumbers2 = new HashSet<Integer>();
        String[] numbers1 = line1.split(" ");
        for (String n : numbers1)
            userNumbers2.add(Integer.parseInt(n));
        GamblingMachine gamblingMachine = new GamblingMachine();
        //when
        //then
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers2));
    }
    }
