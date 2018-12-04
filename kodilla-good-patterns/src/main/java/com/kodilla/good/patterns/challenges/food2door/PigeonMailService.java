package com.kodilla.good.patterns.challenges.food2door;


public class PigeonMailService implements InformationService {

    @Override
    public void inform(OrderDetails orderDetails, boolean isOperationSuccess) {
        if (isOperationSuccess) {
            System.out.println("pigeon with order confirmation was send to "
                + orderDetails.getUser().getName() + " on his address: " + orderDetails.getUser().getAddress());
        }else {
            System.out.println("pigeon with order failure message was send to "
                + orderDetails.getUser().getName() + " on his address: " + orderDetails.getUser().getAddress());
        } 
    } 
}
