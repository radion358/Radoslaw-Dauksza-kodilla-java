package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequest {
    private final User user;
    private final Product product;
    private final LocalDate orderDate;
    private final int quantity;

    public OrderRequest(User user, Product product, LocalDate orderDate, int quantity) {
        this.user = user;
        this.product = product;
        this.orderDate = orderDate;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public int getQuantity() {
        return quantity;
    }
}
