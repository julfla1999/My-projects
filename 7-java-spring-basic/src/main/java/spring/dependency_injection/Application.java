package spring.dependency_injection;

public class Application {
    public static void main(String[] args) {
        DeliveryService deliveryService = new InPost();
        NotificationService notificationService = new NotificationService();
        ShippingCentre shippingCentre = new ShippingCentre(deliveryService, notificationService);
        shippingCentre.sendPackage("Hill Street 11, New York", 18.2);
    }
}
