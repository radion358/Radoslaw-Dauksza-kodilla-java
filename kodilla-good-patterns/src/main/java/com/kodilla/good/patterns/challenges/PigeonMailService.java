package com.kodilla.good.patterns.challenges;

public class PigeonMailService implements InformationService {

    @Override
    public void inform(User user, boolean isOperationSuccess) {
        if (isOperationSuccess) {
            System.out.println("pigeon with order confirmation was send to "
                + user.getName() + " on his address: " + user.getAddress());
        }else {
            System.out.println("pigeon with order failure message was send to "
                + user.getName() + " on his address: " + user.getAddress());
        } 
    } 
}
