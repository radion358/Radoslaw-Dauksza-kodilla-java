package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeOrderService implements OrderService {
    @Override
    public boolean order(OrderDetails orderDetails) {
        System.out.println(orderDetails.getUser().getName() + " ordered:");
        orderDetails.getProductsToOrder().forEach((key, value) -> System.out.println(key + value.toString()));
        return true;
    }
}
