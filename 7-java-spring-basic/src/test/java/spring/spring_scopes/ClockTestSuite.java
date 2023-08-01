package spring.spring_scopes;

import spring.spring_scopes.Clock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

@SpringBootTest
public class ClockTestSuite {

    @Test
    public void shouldCreateCurrentTime() {
        ApplicationContext context = new AnnotationConfigApplicationContext("spring");
        Clock firstBean = context.getBean(Clock.class);
        Clock secondBean = context.getBean(Clock.class);
        Clock thirdBean = context.getBean(Clock.class);
        LocalTime firstTime = firstBean.getCurrentTime();
        LocalTime secondTime = secondBean.getCurrentTime();
        LocalTime thirdTime = thirdBean.getCurrentTime();
        Assertions.assertNotEquals(firstTime, secondTime);
        Assertions.assertNotEquals(secondTime, thirdTime);
        Assertions.assertNotEquals(firstTime, thirdTime);

    }
}
