package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        //When
        BigDecimal calculatedCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(5), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("pizza order", description);
    }

    @Test
    public void testPizzaHutOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaHutOrderDecorator(theOrder);

        //When
        BigDecimal calculatedCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(9), calculatedCost);
    }

    @Test
    public void testPizzaHutOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaHutOrderDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("pizza order from pizzaHut", description);
    }

    @Test
    public void testDagrassoOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DagrassoOrderDecorator(theOrder);

        //When
        BigDecimal calculatedCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(7), calculatedCost);
    }

    @Test
    public void testDagrassoOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DagrassoOrderDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("pizza order from dagrasso", description);
    }

    @Test
    public void testDominosOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DominosPizzaOrderDecorator(theOrder);

        //When
        BigDecimal calculatedCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(8), calculatedCost);
    }

    @Test
    public void testDominosOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DominosPizzaOrderDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("pizza order from dominos", description);
    }

    @Test
    public void testDominosOrderWithJalapenoGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DominosPizzaOrderDecorator(theOrder);
        theOrder = new JalapenoDecorator(theOrder);

        //When
        BigDecimal calculatedCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(9), calculatedCost);
    }

    @Test
    public void testDominosOrderWithJalapenoGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DominosPizzaOrderDecorator(theOrder);
        theOrder = new JalapenoDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("pizza order from dominos + jalapeno", description);
    }

    @Test
    public void testDominosOrderWithExtraCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DominosPizzaOrderDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);

        //When
        BigDecimal calculatedCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(9), calculatedCost);
    }

    @Test
    public void testDominosOrderWithExtraCheeseGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DominosPizzaOrderDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("pizza order from dominos + extra cheese", description);
    }

    @Test
    public void testDominosOrderWithMushroomsGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DominosPizzaOrderDecorator(theOrder);
        theOrder = new MushroomDecorator(theOrder);

        //When
        BigDecimal calculatedCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(9), calculatedCost);
    }

    @Test
    public void testDominosOrderWithMushroomsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DominosPizzaOrderDecorator(theOrder);
        theOrder = new MushroomDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("pizza order from dominos + mushrooms", description);
    }

    @Test
    public void testDominosExpressOrderWithSalamiGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DominosPizzaOrderDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new ExpressDecorator(theOrder);

        //When
        BigDecimal calculatedCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(11), calculatedCost);
    }

    @Test
    public void testDominosExpressOrderWithSalamiGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DominosPizzaOrderDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new ExpressDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("express pizza order from dominos + salami", description);
    }
}
