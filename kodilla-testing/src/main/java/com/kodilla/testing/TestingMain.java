package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int a = 5;
        int b = 5;
        int addResoult = a + b;
        int subtractResoult = a - b;

        if (addResoult == calculator.add(a, b)) {
            System.out.println("Calculator.add() test ok");
        } else {
            System.out.println("Calculator.add() test Error");
        }

        if (subtractResoult == calculator.subtract(a, b)) {
            System.out.println("Calculator.subtract() test ok");
        } else {
            System.out.println("Calculator.subtract() test Error");
        }
    }
}
