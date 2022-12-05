package com.kodilla.spring.basic.spring_dependency_injection.homework.zadanie3;

import com.kodilla.spring.basic.spring_dependency_injection.homework.zadanie3.ShippingCentre;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
class ShippingCentreTestSuite {

    @Test
    public void shouldReturnCorrectMessageIfPackageCannotBeDelivered() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        ShippingCentre bean = context.getBean(ShippingCentre.class);
        String notification = bean.sendPackage("Kromera 13", 60.0);
        Assertions.assertEquals("Package not delivered to: Kromera 13", notification);
    }

    @Test
    public void shouldReturnCorrectMessageIfPackageCanBeDelivered() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        ShippingCentre bean = context.getBean(ShippingCentre.class);
        String notification = bean.sendPackage("Kromera 13", 32.0);
        Assertions.assertEquals("Package delivered to: Kromera 13", notification);
    }

}