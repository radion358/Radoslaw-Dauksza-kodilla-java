package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class OrderDetails {
    private Map<Product, Integer> productsToOrder;
    private LocalDate orderDate;
    private User user;

    public OrderDetails(final Map<Product, Integer> productsToOrder, final LocalDate orderDate, final User user) {
        this.productsToOrder = productsToOrder;
        this.orderDate = orderDate;
        this.user = user;
    }

    public Map<Product, Integer> getProductsToOrder() {
        return new HashMap<Product, Integer>(productsToOrder);
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public User getUser() {
        return user;
    }
}
