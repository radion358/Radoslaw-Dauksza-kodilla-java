package com.kodilla.good.patterns.challenges.food2door;


public class MailService implements InformationService {
    @Override
    public void inform(OrderDetails orderDetails, boolean isOperationSuccess) {
        if (isOperationSuccess) {
            System.out.println("Mail with order confirmation and invoice was send to "
                    + orderDetails.getUser().getName() + " on his email address: " + orderDetails.getUser().getEmail());
        }else {
            System.out.println("Mail with order failure message was send to "
                    + orderDetails.getUser().getName() + " on his email address: " + orderDetails.getUser().getEmail());
        }
    }
}
