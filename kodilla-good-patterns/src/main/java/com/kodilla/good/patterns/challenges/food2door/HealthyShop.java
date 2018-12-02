package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements FoodProducer {
    private List<Product> productList;
    
     public HealthyShop() {
        this.productList = new ArrayList();
        this.productList.add(new Product("Rice", 1.85));
        this.productList.add(new Product("Brown sugar", 4.44));
        this.productList.add(new Product("Bran", 3.33));
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
