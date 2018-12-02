package com.kodilla.good.patterns.challenges.food2door;

public class OrderDetails {
    private Deliverer deliverer;
    private double quantity;
    private Product product;

    public OrderDetails(Deliverer deliverer, double quantity, Product product) {
        this.deliverer = deliverer;
        this.quantity = quantity;
        this.product = product;
    }

    public Deliverer getDeliverer() {
        return deliverer;
    }

    public double getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }
    
    
}
