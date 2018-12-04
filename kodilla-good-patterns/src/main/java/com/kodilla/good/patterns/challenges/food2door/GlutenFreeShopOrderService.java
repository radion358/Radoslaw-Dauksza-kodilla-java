package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public class GlutenFreeShopOrderService implements OrderService {
    @Override public boolean order(OrderDetails orderDetails) {
        double orderValue = 0;
        for (Map.Entry<Product, Integer> entry : orderDetails.getProductsToOrder().entrySet()) {
            Product key = entry.getKey();
            Integer value = entry.getValue();
            orderValue += key.getPrice(value);
        }
        System.out.println(orderDetails.getUser().getName() + "placed an order for: "
        + orderValue + "euro");
        return true;
    }
}
