package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator) context.getBean("calculator");
        //When
        double addResult = calculator.add(1, 1);
        double subResult = calculator.sub(1, 1);
        double mulResult = calculator.mul(1, 1);
        double divResult = calculator.div(1, 1);
        //Then
        Assert.assertEquals(2, addResult, 0.00001);
        Assert.assertEquals(0,subResult, 0.00001);
        Assert.assertEquals(1, mulResult, 0.00001);
        Assert.assertEquals(1, divResult, 0.00001);
    }

}
