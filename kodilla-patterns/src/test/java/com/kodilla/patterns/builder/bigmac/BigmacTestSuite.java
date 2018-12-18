package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmacClassic = new Bigmac.BigmacBuilder()
                .bun(Bigmac.BigmacBuilder.BUN_WITH_SESAME)
                .burgers(2)
                .sauce(Bigmac.BigmacBuilder.KETCHUP)
                .ingredient(Bigmac.BigmacBuilder.CHEESE)
                .ingredient(Bigmac.BigmacBuilder.ONION)
                .ingredient(Bigmac.BigmacBuilder.SALAD)
                .ingredient(Bigmac.BigmacBuilder.TOMATO)
                .build();
        Bigmac bigmacCustomWithMoreThan3Burgers = new Bigmac.BigmacBuilder()
                .bun(Bigmac.BigmacBuilder.BUN_WITHOUT_SESAME)
                .burgers(4)
                .sauce(Bigmac.BigmacBuilder.KETCHUP)
                .ingredient(Bigmac.BigmacBuilder.CHEESE)
                .ingredient(Bigmac.BigmacBuilder.ONION)
                .ingredient(Bigmac.BigmacBuilder.SALAD)
                .build();
        Bigmac bigmacCustomWithLesThan0Burgers = new Bigmac.BigmacBuilder()
                .bun(Bigmac.BigmacBuilder.BUN_WITH_SESAME)
                .burgers(-1)
                .sauce(Bigmac.BigmacBuilder.MAYONNAISE)
                .ingredient(Bigmac.BigmacBuilder.CHEESE)
                .ingredient(Bigmac.BigmacBuilder.ONION)
                .build();
        System.out.println(bigmacClassic);
        System.out.println(bigmacCustomWithLesThan0Burgers);
        System.out.println(bigmacCustomWithMoreThan3Burgers);
        //When
        int howManyIngredientsInBigmacClassic = bigmacClassic.getIngredients().size();
        int howManyIngredientsInBigmacCustomWithMoreThan3Burgers = bigmacCustomWithMoreThan3Burgers.getIngredients().size();
        int howManyIngredientsInBigmacCustomWithLesThan0Burgers = bigmacCustomWithLesThan0Burgers.getIngredients().size();
        int howManyBurgersInBigmacClassic = bigmacClassic.getBurgers();
        int howManyBurgersInBigmacCustomWithMoreThan3Burgers = bigmacCustomWithMoreThan3Burgers.getBurgers();
        int howManyBurgersInBigmacCustomWithLesThan0Burgers = bigmacCustomWithLesThan0Burgers.getBurgers();
        //Then
        Assert.assertEquals(2, howManyBurgersInBigmacClassic);
        Assert.assertEquals(1, howManyBurgersInBigmacCustomWithMoreThan3Burgers);
        Assert.assertEquals(1, howManyBurgersInBigmacCustomWithLesThan0Burgers);
        Assert.assertEquals(4, howManyIngredientsInBigmacClassic);
        Assert.assertEquals(3, howManyIngredientsInBigmacCustomWithMoreThan3Burgers);
        Assert.assertEquals(2, howManyIngredientsInBigmacCustomWithLesThan0Burgers);
    }
}
