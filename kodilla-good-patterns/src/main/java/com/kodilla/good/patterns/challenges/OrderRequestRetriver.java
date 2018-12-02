package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequestRetriver {
    public OrderRequest retrive() {
        User user = new User("Janusz", "swamp");
        Product socks = new Socks();
        LocalDate orderDate = LocalDate.now();
        return new OrderRequest(user, socks, orderDate, 2);
    }
}
