package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();

        stamps.add(new Stamp("Ptaki polskie", "31,25 x 39,5 mm", false));
        stamps.add(new Stamp("Boże Narodzenie", "40,5 x 40,5 mm", true));
        stamps.add(new Stamp("Miron Białoszewski", "31,25 x 39,5 mm", false));
        stamps.add(new Stamp("Ptaki polskie", "31,25 x 39,5 mm", false));

        System.out.println(stamps.size());

        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
