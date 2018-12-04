package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.InformationService;
import com.kodilla.good.patterns.challenges.OrderRepository;
import com.kodilla.good.patterns.challenges.OrderService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoodProducer {
    private Map<Product, Integer> products;
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public FoodProducer(Map<Product, Integer> products, InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.products = products;
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public boolean process(OrderDetails orderDetails) {
        return true;
    }
}
