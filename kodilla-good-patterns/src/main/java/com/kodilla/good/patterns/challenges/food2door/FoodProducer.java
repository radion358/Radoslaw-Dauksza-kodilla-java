package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public interface FoodProducer {
    boolean process(OrderDetails orderDetails);
    List<Product> getProductList();
}
