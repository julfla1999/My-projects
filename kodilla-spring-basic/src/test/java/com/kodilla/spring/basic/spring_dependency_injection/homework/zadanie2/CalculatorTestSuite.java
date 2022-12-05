package com.kodilla.spring.basic.spring_dependency_injection.homework.zadanie2;

import com.kodilla.spring.basic.spring_dependency_injection.homework.zadanie2.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuite {

    @Test
    public void shouldAddValuesCorrectly() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.add(15.07, 16.09);
        assertEquals(31.16, value);
    }

    @Test
    public void shouldSubtractValuesCorrectly() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.subtract(30.83, 10.23);
        assertEquals(20.60, value, 0.001);
    }

    @Test
    public void shouldMultiplyValuesCorrectly() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.multiply(6.40, 3.52);
        assertEquals(22.528, value, 0.001);
    }

    @Test
    public void shouldDivideValuesCorrectly() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.divide(2.50, 0.50);
        assertEquals(5.0, value);
    }

}