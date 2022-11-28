package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class AlertServiceTestSuite {

    AlertService alertService = new AlertService();
    Location london = Mockito.mock(Location.class);
    Location paris = Mockito.mock(Location.class);
    Location valletta = Mockito.mock(Location.class);
    Client firstClient = Mockito.mock(Client.class);
    Client secondClient = Mockito.mock(Client.class);
    Client thirdClient = Mockito.mock(Client.class);
    Alert alert = Mockito.mock(Alert.class);

    @Test
    public void notSubscribedClientsShouldNotReceiveAlerts() {
        alertService.sendAlertToEveryone(alert);
        Mockito.verify(firstClient, Mockito.never()).receive(alert);
    }

    @Test
    public void subscribedClientShouldReceiveAlertForLocation() {
        alertService.addSubscriberToLocation(london, firstClient);
        alertService.addSubscriberToLocation(london, secondClient);
        alertService.addSubscriberToLocation(valletta, secondClient);
        alertService.addSubscriberToLocation(london, thirdClient);
        alertService.addSubscriberToLocation(paris, thirdClient);

        alertService.sendAlertForLocation(london, alert);
        alertService.sendAlertForLocation(paris, alert);
        Mockito.verify(firstClient).receive(alert);
        Mockito.verify(secondClient, Mockito.times(1)).receive(alert);
        Mockito.verify(thirdClient, Mockito.times(2)).receive(alert);
    }

    @Test
    public void shouldLetClientUnsubscribeLocation() {
        alertService.addSubscriberToLocation(valletta, firstClient);
        alertService.addSubscriberToLocation(paris, firstClient);
        alertService.deleteSubscriberFromLocation(paris, firstClient);

        alertService.sendAlertForLocation(valletta, alert);
        alertService.sendAlertForLocation(paris, alert);

        Mockito.verify(firstClient, Mockito.times(1)).receive(alert);

    }

    @Test
    public void shouldNotSendAnyAlertsToClientWhoUnsubscribedEveryLocation() {
        alertService.addSubscriberToLocation(london, firstClient);
        alertService.addSubscriberToLocation(paris, firstClient);
        alertService.addSubscriberToLocation(london, secondClient);

        alertService.deleteSubscriberFromEveryLocation(firstClient);
        alertService.sendAlertToEveryone(alert);

        Mockito.verify(secondClient).receive(alert);
        Mockito.verify(firstClient, Mockito.never()).receive(alert);
    }

    @Test
    public void shouldSendAlertToEveryone() {
        alertService.addSubscriberToLocation(london, firstClient);
        alertService.addSubscriberToLocation(london, secondClient);
        alertService.addSubscriberToLocation(paris, firstClient);
        alertService.addSubscriberToLocation(paris, secondClient);
        alertService.addSubscriberToLocation(valletta, firstClient);
        alertService.addSubscriberToLocation(valletta, thirdClient);

        alertService.sendAlertToEveryone(alert);
        Mockito.verify(firstClient, Mockito.times(1)).receive(alert);
        Mockito.verify(secondClient, Mockito.times(1)).receive(alert);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(alert);
    }

    @Test
    public void shouldDeleteLocation() {
        alertService.addSubscriberToLocation(london, firstClient);
        alertService.addSubscriberToLocation(paris, secondClient);
        alertService.addSubscriberToLocation(valletta, thirdClient);

        alertService.deleteLocation(paris);
        alertService.sendAlertToEveryone(alert);
        Mockito.verify(firstClient).receive(alert);
        Mockito.verify(thirdClient).receive(alert);
        Mockito.verify(secondClient, Mockito.never()).receive(alert);
    }
}