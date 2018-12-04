package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

class FoodProducer {
    private Map<Product, Integer> products;
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    FoodProducer(Map<Product, Integer> products, InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.products = products;
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    boolean process(OrderDetails orderDetails) {
        if(orderService.order(orderDetails)) {
            informationService.inform(orderDetails, true);
            orderRepository.saveOrder(orderDetails);
            return true;
        }else {
            informationService.inform(orderDetails, false);
            return false;
        }
    }

    Map<Product, Integer> getProducts() {
        return products;
    }
}
