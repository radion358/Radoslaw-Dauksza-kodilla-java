package com.kodilla.good.patterns.challenges;

public interface Product {
    String getDescription();
    Boolean isAvailable(int quantity);
    void subtractOrderedProduct(int quantity);
}
