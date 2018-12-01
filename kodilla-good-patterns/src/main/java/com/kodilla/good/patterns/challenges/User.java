package com.kodilla.good.patterns.challenges;

public class User {
    private String userName;
    private String userAddress;

    public User(String userName, String userAddress) {
        this.userName = userName;
        this.userAddress = userAddress;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserAddress() {
        return userAddress;
    }
}
