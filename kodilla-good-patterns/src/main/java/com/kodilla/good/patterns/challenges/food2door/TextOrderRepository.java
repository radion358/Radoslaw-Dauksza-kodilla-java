package com.kodilla.good.patterns.challenges.food2door;

public class TextOrderRepository implements OrderRepository {
    @Override
    public void saveOrder(OrderDetails orderDetails) {
        System.out.println("order \"" + orderDetails.getOrderDate() + ": "
                + orderDetails.getUser().getName() + " ordered ");

        orderDetails.getProductsToOrder().forEach((key, value) -> System.out.println(key.getName() + " " + value.toString()));
        System.out.println("\" was saved properly");
    }
}
