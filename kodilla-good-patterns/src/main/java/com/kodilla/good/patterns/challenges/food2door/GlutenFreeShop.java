package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements FoodProducer {
    private List<Product> productList;

    public GlutenFreeShop() {
        this.productList = new ArrayList();
        this.productList.add(new Product("Bred without Gluten 1Kg", 5.4));
        this.productList.add(new Product("Pasta without gluten 500g", 3.22));
        this.productList.add(new Product("water 0,5L", 0.8));
    }
    
    @Override
    public boolean process(OrderDetails orderDetails) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> getProductList() {
        return new ArrayList(productList);
    }
    
}
