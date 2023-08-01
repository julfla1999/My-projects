package execution_model;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> getOrdersFromDateRange(int firstDate, int secondDate) {
        List<Order> result = new ArrayList<>();
        for (Order order : orders) {
            if ( order.getDate() >= firstDate && order.getDate() <= secondDate )
                result.add(order);
        }
        return result;
    }

    public List<Order> getOrdersFromPriceRange(double firstPrice, double secondPrice) {
        List<Order> result = new ArrayList<>();
        for (Order order : orders) {
            if ( order.getPrice() >= firstPrice && order.getPrice() <= secondPrice )
                result.add(order);
        }
        return result;
    }

    public int getNumberOfOrders() {
        return this.orders.size();
    }

    public double getSumOfOrders() {
        double result = 0;
        for (Order order : orders ) {
            result += order.getPrice();
        }
        return result;
    }
}
