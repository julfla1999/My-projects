package spring.spring_dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShippingCentre {

    @Autowired
    @Qualifier(value = "inPost")
    private DeliveryService deliveryService;

    @Autowired
    private NotificationService notificationService;


    public String sendPackage(String address, double weight) {
        if (this.deliveryService.deliverPackage(address, weight)) {
            return this.notificationService.success(address);
        }
        return this.notificationService.fail(address);
    }
}
