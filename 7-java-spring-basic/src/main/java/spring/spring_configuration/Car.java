package spring.spring_configuration;

import java.time.LocalTime;

public interface Car {

    public default boolean hasHeadlightsTurnedOn(LocalTime time) {
        return time.isAfter(LocalTime.of(19,59,59)) || time.isBefore(LocalTime.of(06,00,00));
    }


    public String getCarType();
}
