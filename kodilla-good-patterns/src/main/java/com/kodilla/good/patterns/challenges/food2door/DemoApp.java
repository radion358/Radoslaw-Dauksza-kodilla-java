package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.OrderRepository;
import com.kodilla.good.patterns.challenges.PigeonMailService;
import com.kodilla.good.patterns.challenges.TextFileRepository;

import java.util.HashMap;
import java.util.Map;

public class DemoApp {
    public static void main(String[] args) {
        OrderRepository orderRepository = new TextFileRepository();

        Map<Product, Integer> extraFoodProducts = new HashMap<>();
        extraFoodProducts.put(new Product("Egg", 0.2), 4);
        extraFoodProducts.put(new Product("Banana", 1.74), 5);
        extraFoodProducts.put(new Product("Sushi", 7.8), 6);

        Map<Product, Integer> glutenFreeProducts = new HashMap<>();
        glutenFreeProducts.put(new Product("Bred without Gluten 1Kg", 5.4), 4);
        glutenFreeProducts.put(new Product("Pasta without gluten 500g", 3.22), 8);
        glutenFreeProducts.put(new Product("water 0,5L", 0.8), 7);

        Map<Product, Integer> healthyShopProducts = new HashMap<>();
        healthyShopProducts.put(new Product("Rice", 1.85), 6);
        healthyShopProducts.put(new Product("Brown sugar", 4.44), 1);
        healthyShopProducts.put(new Product("Bran", 3.33), 2);

        FoodProducer extraFoodShop = new FoodProducer(extraFoodProducts, new PigeonMailService(), new ExtraFoodShopOrderService(), orderRepository);
        FoodProducer glutenFreeShop = new FoodProducer(glutenFreeProducts, new MailService(), new GlutenFreeOrderService(), orderRepository);
        FoodProducer helthyShop = new FoodProducer(healthyShopProducts, new SMSService(), new GlutenFreeShopOrderService(), orderRepository);
    }
}
