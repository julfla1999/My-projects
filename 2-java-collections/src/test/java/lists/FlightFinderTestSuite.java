package lists;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom() {
        //when
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsFrom("London");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("London", "Berlin"));
        expectedList.add(new Flight("London", "Dublin"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsTo() {
        //when
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsTo("Cagliari");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Berlin", "Cagliari"));
        assertEquals(expectedList, result);
    }



}
