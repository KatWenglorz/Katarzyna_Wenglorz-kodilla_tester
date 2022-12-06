package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {

        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warszawa", "Berlin"));
        flights.add(new Flight("Warszawa", "Madryt"));
        flights.add(new Flight("Madryt", "Paryż"));
        flights.add(new Flight("Madryt", "Londyn"));
        flights.add(new Flight("Madryt", "Oslo"));
        flights.add(new Flight("Paryż", "Berlin"));

        return flights;
    }
    }
