package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> directory = new HashMap<>();

        Principal dumbledore = new Principal("Dumbledore", "Hogwart");
        Principal karkarow = new Principal("Karkarow", "Durmstrang");
        Principal maxime = new Principal("Maxime", "Beauxbatons");

        School hogwart = new School(Arrays.asList(40,44,50,38));
        School durmstrang = new School(Arrays.asList(60,53,71,49));
        School beauxbatons = new School(Arrays.asList(26,33,28,40));

        directory.put(dumbledore, hogwart);
        directory.put(karkarow, durmstrang);
        directory.put(maxime, beauxbatons);

        for (Map.Entry<Principal, School> schoolEntry : directory.entrySet()) {
            System.out.println(schoolEntry.getKey().getLastName() + " is a principal of " + schoolEntry.getKey().getSchoolName() + ". The school has " + schoolEntry.getValue().getSumOfStudents() + " students.");
        }
    }
}
