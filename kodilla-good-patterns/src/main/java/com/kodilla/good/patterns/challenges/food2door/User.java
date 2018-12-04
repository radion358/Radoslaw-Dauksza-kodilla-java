package com.kodilla.good.patterns.challenges.food2door;

public class User {
    private String name;
    private String address;
    private String phoneNumber;
    private String eMail;

    User(String name, String address, String phoneNumber, String eMail) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }

    String getAddress() {
        return address;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

    String getEmail() {
        return eMail;
    }
}
