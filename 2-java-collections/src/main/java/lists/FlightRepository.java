package lists;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("London", "Berlin"));
        flights.add(new Flight("London", "Dublin"));
        flights.add(new Flight("Warsaw", "Berlin"));
        flights.add(new Flight("Warsaw", "Prague"));
        flights.add(new Flight("Berlin", "Prague"));
        flights.add(new Flight("Berlin", "Cagliari"));
        return flights;
    }

}
