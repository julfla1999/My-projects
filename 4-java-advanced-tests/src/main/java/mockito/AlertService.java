package mockito;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AlertService {

    private Map<Location, Set<Client>> alerts = new HashMap<>();

    public void addSubscriberToLocation(Location location, Client client) {
        if ( alerts.get(location) == null )
            alerts.put(location, new HashSet<Client>());
        alerts.get(location).add(client);
    }

    public void deleteSubscriberFromLocation(Location location, Client client) {
        alerts.get(location).remove(client);
    }

    public void deleteSubscriberFromEveryLocation(Client client) {
        for ( Location location : alerts.keySet() )
            alerts.get(location).remove(client);
    }

    public void sendAlertForLocation(Location location, Alert alert) {
        alerts.get(location).forEach(client -> client.receive(alert));
    }

    public void sendAlertToEveryone(Alert alert) {
        Set<Client> allClients = new HashSet<>();
        for ( Location location : alerts.keySet() ) {
            for ( Client client : alerts.get(location))
                allClients.add(client);
        }
        allClients.forEach(client -> client.receive(alert));
    }

    public void deleteLocation(Location location) {
        alerts.remove(location);
    }
}
