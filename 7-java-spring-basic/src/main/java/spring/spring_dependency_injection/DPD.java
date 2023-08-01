package spring.spring_dependency_injection;

import org.springframework.stereotype.Component;

@Component
public class DPD implements DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Delivering by DPD in progress...");
        return true;
    }
}
