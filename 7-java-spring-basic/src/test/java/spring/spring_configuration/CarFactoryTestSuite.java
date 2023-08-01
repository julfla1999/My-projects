package spring.spring_configuration;

import spring.spring_configuration.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class CarFactoryTestSuite {

    @Test
    public void shouldCreateRandomCar() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("spring");
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
        ApplicationContext context = new AnnotationConfigApplicationContext("spring");
        Car car = (Car) context.getBean("getRandomCar");
        //when
        boolean result = car.hasHeadlightsTurnedOn(LocalTime.of(22,00,00));
        //then
        Assertions.assertTrue(result);

    }

}