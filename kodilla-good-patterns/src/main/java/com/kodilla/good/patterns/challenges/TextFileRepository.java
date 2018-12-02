package com.kodilla.good.patterns.challenges;

public class TextFileRepository implements OrderRepository {

    @Override
    public void createOrder(OrderRequest orderRequest) {
        System.out.println("order \"" + orderRequest.getOrderDate() + ": " 
                + orderRequest.getUser().getName() + " ordered " 
                + orderRequest.getQuantity() + " " 
                + orderRequest.getProduct().getName() + "\" was created properly");
    } 
}
