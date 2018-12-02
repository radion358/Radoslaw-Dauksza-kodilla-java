package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrive();
        
        OrderProcessor orderProcessor = new OrderProcessor(
                new PigeonMailService(), new ProductOrderService(), new TextFileRepository());
        orderProcessor.process(orderRequest);
    }
}
