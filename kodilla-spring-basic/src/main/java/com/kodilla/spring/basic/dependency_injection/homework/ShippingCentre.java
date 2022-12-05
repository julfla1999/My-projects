package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCentre {

    private DeliveryService deliveryService;
    private NotificationService notificationService;

    public ShippingCentre(DeliveryService deliveryService, NotificationService notificationService) {
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }

    public void sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            notificationService.success(address);
        } else {
            notificationService.fail(address);
        }
    }
}
