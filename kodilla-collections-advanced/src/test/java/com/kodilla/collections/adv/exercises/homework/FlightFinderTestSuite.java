package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.adv.exercises.homework.FlightRepository.getFlightsTable;
import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsTo() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        getFlightsTable().add(new Flight("Warszawa", "Berlin"));
        getFlightsTable().add(new Flight("Paryż", "Berlin"));
        //when
        List<Flight> result = flightFinder.findFlightsTo("Berlin");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warszawa", "Berlin"));
        expectedList.add(new Flight("Paryż", "Berlin"));
        assertEquals(result, expectedList);
    }
    @Test
    public void testFindFlightsFrom() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        getFlightsTable().add(new Flight("Madryt", "Paryż"));
        getFlightsTable().add(new Flight("Madryt", "Londyn"));
        getFlightsTable().add(new Flight("Madryt", "Oslo"));
        //when
        List<Flight> result1 = flightFinder.findFlightsFrom("Madryt");
        //then
        List<Flight> expectedList1 = new ArrayList<>();
        expectedList1.add(new Flight("Madryt", "Paryż"));
        expectedList1.add(new Flight("Madryt", "Londyn"));
        expectedList1.add(new Flight("Madryt", "Oslo"));
        assertEquals(result1, expectedList1);
    }
}