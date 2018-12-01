package com.kodilla.good.patterns.challenges;

public class Mug implements Product {
    private int quantity;
    private String description;

    public Mug(int quantity, String description) {
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
