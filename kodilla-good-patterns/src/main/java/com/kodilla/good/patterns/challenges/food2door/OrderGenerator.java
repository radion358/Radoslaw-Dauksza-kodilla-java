package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

 class OrderGenerator {
    static OrderDetails generateOrder(FoodProducer foodProducer, User user) {
        Map<Product, Integer> productsToOrder = new HashMap<>();
        foodProducer.getProducts().forEach((key, value) -> productsToOrder.put(key, value - 20));
        return new OrderDetails(productsToOrder, LocalDate.now(), user);
    }
}
