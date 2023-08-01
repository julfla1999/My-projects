package spring.dependency_injection;

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
