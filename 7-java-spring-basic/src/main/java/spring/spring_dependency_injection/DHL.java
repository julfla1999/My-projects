package spring.spring_dependency_injection;

import org.springframework.stereotype.Component;

@Component
public class DHL implements DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 20) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Delivering by DHL in progress...");
        return true;
    }
}
