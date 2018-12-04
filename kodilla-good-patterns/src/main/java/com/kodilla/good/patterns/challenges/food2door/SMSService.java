package com.kodilla.good.patterns.challenges.food2door;


public class SMSService implements InformationService {
    @Override
    public void inform(OrderDetails orderDetails, boolean isOperationSuccess) {
        if (isOperationSuccess) {
            System.out.println("SMS with order confirmation was send to "
                    + orderDetails.getUser().getName() + " on his phone number: " + orderDetails.getUser().getPhoneNumber());
        }else {
            System.out.println("SMS with order failure message was send to "
                    + orderDetails.getUser().getName() + " on his phone number: " + orderDetails.getUser().getPhoneNumber());
        }
    }
}
