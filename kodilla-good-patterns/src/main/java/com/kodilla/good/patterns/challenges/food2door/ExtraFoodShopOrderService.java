package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShopOrderService implements OrderService {
    private int orderNumber = 0;
    @Override
    public boolean order(OrderDetails orderDetails) {
        System.out.println(orderDetails.getOrderDate() + ": "
                + orderDetails.getUser().getName() + " placed an ordered. The order number is "
                + orderNumber);
        orderNumber++;
        return true;
    }
}
