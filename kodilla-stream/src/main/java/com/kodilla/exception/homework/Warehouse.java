package com.kodilla.exception.homework;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {
    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesNotExistException {
        List<Order> result = orders
                    .stream()
                    .filter(order -> order.getNumber().equals(number))
                    .collect(Collectors.toList());
            if (result.size() == 1) {
                Order order = result.get(0);
                return order;
            }
            throw new OrderDoesNotExistException();
    }
}
