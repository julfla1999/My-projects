package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarFactoryTestSuite {

    @Test
    public void shouldCreateRandomCar() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("getRandomCar");
        //when
        String name = car.getCarType();
        System.out.println(name);
        //then
        List<String> possibleNames = Arrays.asList("SUV", "Cabrio", "Sedan");
        Assertions.assertTrue(possibleNames.contains(name));
    }

    @Test
    public void shouldTurnOnLightsAtCorrectTime() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("getRandomCar");
        //when
        boolean result = car.hasHeadlightsTurnedOn(LocalTime.of(22,00,00));
        //then
        Assertions.assertTrue(result);

    }

}