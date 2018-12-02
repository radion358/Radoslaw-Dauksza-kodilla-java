package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements FoodProducer {
    private List<Product> productList;

    public ExtraFoodShop() {
        this.productList = new ArrayList();
        this.productList.add(new Product("Egg", 0.2));
        this.productList.add(new Product("Banana", 1.74));
        this.productList.add(new Product("Sushi", 7.8));
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
