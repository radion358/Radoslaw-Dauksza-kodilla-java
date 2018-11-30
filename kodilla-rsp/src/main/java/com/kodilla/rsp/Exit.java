package com.kodilla.rsp;

import java.util.Scanner;

public class Exit {
    public static boolean confirm (Scanner scanner) {
        System.out.println("are you sure, you want to exit?");
        boolean incorrectAnswer = true;
        while (incorrectAnswer) {
            System.out.println("if yes type y/ if not type n");
            switch (scanner.nextLine()) {
            default:
                break;
            case "y":
                incorrectAnswer= false;
                return true;
            case "n":
                incorrectAnswer = false;
                return false;
            }
        }
        return false;
    }
}
