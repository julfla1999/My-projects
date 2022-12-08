package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Cabrio implements Car {

    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime time) {
        return time.isAfter(LocalTime.of(19,59,59)) || time.isBefore(LocalTime.of(06,00,00));
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
