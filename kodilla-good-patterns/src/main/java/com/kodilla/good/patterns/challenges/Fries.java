package com.kodilla.good.patterns.challenges;

public class Fries implements Product {
    private int quantity;
    private String description;

    public Fries(int quantity, String description) {
        this.quantity = quantity;
        this.description = description;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public Boolean isAvailable(int quantity) {
        return null;
    }

    @Override
    public void subtractOrderedProduct(int quantity) {

    }
}
