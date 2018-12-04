package com.kodilla.good.patterns.challenges.food2door;

public class TextOrderRepository implements OrderRepository {
    @Override
    public void saveOrder(OrderDetails orderDetails) {
        System.out.println("order \"" + orderDetails.getOrderDate() + ": "
                + orderDetails.getUser().getName() + " ordered "
                + orderDetails.getProductsToOrder() + "\" was saved properly");
    }
}
