package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.OrderRequest;
import com.kodilla.good.patterns.challenges.OrderService;

public class ExtraFoodShopOrderService implements OrderService {
    @Override
    public boolean order(OrderRequest orderRequest) {
        return false;
    }
}
