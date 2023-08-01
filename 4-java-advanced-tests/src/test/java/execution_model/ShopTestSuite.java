package execution_model;

import execution_model.Order;
import execution_model.Shop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();
    Order shoes = new Order(130.90, 220715, "eliza");
    Order dress = new Order(90.80, 220923, "hanka");
    Order skirt = new Order(50.60, 221103, "igunia");
    Order jeans = new Order(120.40, 220916, "kacper");
    Order shirt = new Order(80.20, 220401, "lukas");

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(shoes);
        shop.addOrder(dress);
        shop.addOrder(skirt);
        shop.addOrder(jeans);
        shop.addOrder(shirt);
    }

    @Test
    public void shouldAddOrderToTheShop() {
        //when
        int numberOfOrders = shop.getNumberOfOrders();
        //then
        assertEquals(5, numberOfOrders);
    }

    @Test
    public void shouldReturnOrdersFromDateRange() {
        //when
        List<Order> result = shop.getOrdersFromDateRange(220401, 220920);
        //then
        List<Order> expectedList = new ArrayList<>();
        expectedList.add(shoes);
        expectedList.add(jeans);
        expectedList.add(shirt);
        assertEquals(3, result.size());
        assertEquals(expectedList, result);
    }

    @Test
    public void shouldReturnOrdersFromPriceRange() {
        //when
        List<Order> result = shop.getOrdersFromPriceRange(90.00, 130.00);
        //then
        List<Order> expectedList = new ArrayList<>();
        expectedList.add(dress);
        expectedList.add(jeans);
        assertEquals(2, result.size());
        assertEquals(expectedList, result);
    }

    @Test
    public void shouldReturnNumberOfOrders() {
        //when
        int numberOfOrders = shop.getNumberOfOrders();
        //then
        assertEquals(5, numberOfOrders);
    }

    @Test
    public void shouldReturnSumOfOrders() {
        //when
        double sumOfOrders = shop.getSumOfOrders();
        //then
        assertEquals(472.90, sumOfOrders, 0.001);

    }

}