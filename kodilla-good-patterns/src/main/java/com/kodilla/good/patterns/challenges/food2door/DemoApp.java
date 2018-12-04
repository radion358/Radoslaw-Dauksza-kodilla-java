package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class DemoApp {
    public static void main(String[] args) {
        OrderRepository ordersRepository = new TextOrderRepository();
        User food2Door = new User("Food2Door", "Tuwima 4", "123456789", "qwerty@poiuy.yy");

        Map<Product, Integer> extraFoodProducts = new HashMap<>();
        extraFoodProducts.put(new Product("Egg", 0.2), 44);
        extraFoodProducts.put(new Product("Banana", 1.74), 55);
        extraFoodProducts.put(new Product("Sushi", 7.8), 66);

        Map<Product, Integer> glutenFreeProducts = new HashMap<>();
        glutenFreeProducts.put(new Product("Bred without Gluten 1Kg", 5.4), 45);
        glutenFreeProducts.put(new Product("Pasta without gluten 500g", 3.22), 86);
        glutenFreeProducts.put(new Product("water 0,5L", 0.8), 72);

        Map<Product, Integer> healthyShopProducts = new HashMap<>();
        healthyShopProducts.put(new Product("Rice", 1.85), 63);
        healthyShopProducts.put(new Product("Brown sugar", 4.44), 51);
        healthyShopProducts.put(new Product("Bran", 3.33), 82);

        FoodProducer extraFoodShop = new FoodProducer(extraFoodProducts, new MailService(), new ExtraFoodShopOrderService(), ordersRepository);
        FoodProducer glutenFreeShop = new FoodProducer(glutenFreeProducts, new PigeonMailService(), new GlutenFreeOrderService(), ordersRepository);
        FoodProducer healthyShop = new FoodProducer(healthyShopProducts, new SMSService(), new GlutenFreeShopOrderService(), ordersRepository);

        OrderDetails extraFoodOrder = OrderGenerator.generateOrder(extraFoodShop, food2Door);
        OrderDetails glutenFreeOrder = OrderGenerator.generateOrder(glutenFreeShop, food2Door);
        OrderDetails healthyOrder = OrderGenerator.generateOrder(healthyShop, food2Door);

        extraFoodShop.process(extraFoodOrder);
        System.out.println();
        glutenFreeShop.process(glutenFreeOrder);
        System.out.println();
        healthyShop.process(healthyOrder);
    }
}
