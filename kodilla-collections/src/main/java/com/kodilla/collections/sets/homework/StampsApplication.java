package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Warsaw", "4x5", "ostemplowany"));
        stamps.add(new Stamp("London", "6x6", "nieostemplowany"));
        stamps.add(new Stamp("Cagliari", "5x5", "ostemplowany"));
        stamps.add(new Stamp("Warsaw", "4x5", "ostemplowany"));

        System.out.println(stamps.size());
        for ( Stamp stamp : stamps )
            System.out.println(stamp);
    }
}
