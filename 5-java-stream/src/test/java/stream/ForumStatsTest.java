package stream;

import stream.ForumStats;
import stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatsTest {


    @Test
    public void testGetAverageNumberOfPostOfYoungerUsers() {
        //given
        List<User> example = new ArrayList<>();
        example.add(new User("Artur", 39, 590, "green"));
        example.add(new User("Bartosz", 40, 4, "blue"));
        example.add(new User("Cezary", 60, 308, "green"));
        example.add(new User("Damian", 41, 0, "red"));
        example.add(new User("Edward", 51, 2477, "red"));
        example.add(new User("Franciszek", 23, 17, "blue"));
        //when
        double result = ForumStats.getAverageNumberOfPostOfYoungerUsers(example);
        //then
        List<User> expectedList = new ArrayList<>();
        expectedList.add(new User("Artur", 39, 590, "green"));
        expectedList.add(new User("Franciszek", 23, 17, "blue"));
        double expected = 303.5;
        assertEquals(expected, result);
    }

    @Test
    public void testGetAverageNumberOfPostOfOlderUsers() {
        //given
        List<User> example = new ArrayList<>();
        example.add(new User("Artur", 39, 590, "green"));
        example.add(new User("Bartosz", 40, 4, "blue"));
        example.add(new User("Cezary", 60, 308, "green"));
        example.add(new User("Damian", 41, 0, "red"));
        example.add(new User("Edward", 51, 2477, "red"));
        example.add(new User("Franciszek", 23, 17, "blue"));
        //when
        double result = ForumStats.getAverageNumberOfPostOfOlderUsers(example);
        //then
        List<User> expectedList = new ArrayList<>();
        expectedList.add(new User("Bartosz", 40, 4, "blue"));
        expectedList.add(new User("Cezary", 60, 308, "green"));
        expectedList.add(new User("Damian", 41, 0, "red"));
        expectedList.add(new User("Edward", 51, 2477, "red"));
        double expected = 697.25;
        assertEquals(expected, result);
    }


}
