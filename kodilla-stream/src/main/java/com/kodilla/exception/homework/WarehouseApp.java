package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("11/22/1"));
        warehouse.addOrder(new Order("11/22/2"));
        warehouse.addOrder(new Order("11/22/3"));
        warehouse.addOrder(new Order("11/22/4"));

        try {
            Order order = warehouse.getOrder("11/22/5");
            System.out.println("Order number: " + order.getNumber());
        } catch (OrderDoesNotExistException e) {
            System.out.println("No orders found. Check if the number is correct.");
        }
    }
}
