package spring.spring_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Random;

@Configuration
public class CarFactory {

    @Bean
    public Car getRandomCar() {
        Car car;
        Random generator = new Random();
        long firstDay = LocalDate.of(2022, 01, 01).toEpochDay();
        long lastDay = LocalDate.of(2023, 01, 01).toEpochDay();
        long day = generator.nextLong(lastDay - firstDay ) + firstDay;
        LocalDate randomDay = LocalDate.ofEpochDay(day);
        System.out.println(randomDay);
        if (randomDay.getMonth() == Month.DECEMBER || randomDay.getMonth() == Month.JANUARY || randomDay.getMonth() == Month.FEBRUARY) {
            car = new SUV();
        } else if (randomDay.getMonth() == Month.JUNE || randomDay.getMonth() == Month.JULY || randomDay.getMonth() == Month.AUGUST) {
            car = new Cabrio();
        } else {
            car = new Sedan();
        }
        return car;
    }


}
