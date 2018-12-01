package com.kodilla.good.patterns.challenges;


public class ProductOrderService {
    private Information information;
    private Order order;
    private Database database;

    public ProductOrderService(final Information information, final Order order, final Database database) {
        this.information = information;
        this.order = order;
        this.database = database;
    }

}
