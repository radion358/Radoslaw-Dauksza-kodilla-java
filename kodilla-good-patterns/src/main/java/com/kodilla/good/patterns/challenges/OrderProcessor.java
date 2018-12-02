package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                                         final OrderService orderService,
                                         final OrderRepository orderRepository) {
       this.informationService = informationService;
       this.orderService = orderService;
       this.orderRepository = orderRepository;
    }

    public void process(final OrderRequest orderRequest) {
       boolean isOrdered = orderService.order(orderRequest);

       if(isOrdered) {
           informationService.inform(orderRequest.getUser(), isOrdered);
           orderRepository.createOrder(orderRequest);
        }else {
           informationService.inform(orderRequest.getUser(), isOrdered);
        } 
    }
}
