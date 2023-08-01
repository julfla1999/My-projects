package spring.spring_dependency_injection;

import org.springframework.stereotype.Component;

@Component
public class InPost implements DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 50) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Delivering by InPost in progress...");
        return true;
    }
}
