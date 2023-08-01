package exception;

import exception.Order;
import exception.OrderDoesNotExistException;
import exception.Warehouse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class WarehouseTestSuite {

    @Test
    public void testGetOrder_withException() {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("11/22/1"));
        warehouse.addOrder(new Order("11/22/2"));
        warehouse.addOrder(new Order("11/22/3"));
        //then
        assertThrows(OrderDoesNotExistException.class, () -> warehouse.getOrder("11/22/4"));
    }
}