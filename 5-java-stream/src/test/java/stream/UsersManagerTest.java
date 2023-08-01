package stream;

import org.junit.jupiter.api.Test;
import stream.User;
import stream.UsersManager;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersManagerTest {

    @Test
    public void testFilterChemistGroupsUsernames() {
        //when
        List<String> result = UsersManager.filterChemistGroupsUsernames();
        //then
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Walter White");
        expectedList.add("Gale Boetticher");
        assertEquals(expectedList, result);
    }

    @Test
    public void testFilterUsersWithCertainAge() {
        //when
        List<User> result = UsersManager.filterUsersWithCertainAge(45);
        //then
        List<User> expectedList = new ArrayList<>();
        expectedList.add(new User("Walter White", 50, 7, "Chemists"));
        expectedList.add(new User("Gus Firing", 49, 0, "Board"));
        expectedList.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFilterUsersWithNoPosts() {
        //when
        List<String> result = UsersManager.filterUsersWithNoPosts();
        //then
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Gus Firing");
        expectedList.add("Mike Ehrmantraut");
        assertEquals(expectedList, result);
    }
}
