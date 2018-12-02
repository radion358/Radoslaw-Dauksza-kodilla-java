package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService {
   @Override
   public boolean order(OrderRequest orderRequest) {
        System.out.println(orderRequest.getOrderDate() + ": " 
                + orderRequest.getUser().getName() + " ordered " 
                + orderRequest.getQuantity() + " " + orderRequest.getProduct().getName());
        return true;
   }
}
