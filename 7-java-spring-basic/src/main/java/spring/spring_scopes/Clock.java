package spring.spring_scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Scope("prototype")
public class Clock {

    private LocalTime currentTime;

    public Clock() {
        this.currentTime = LocalTime.now();
    }

    public LocalTime getCurrentTime() {
        System.out.println(currentTime);
        return currentTime;
    }
}
