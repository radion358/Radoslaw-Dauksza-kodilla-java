package com.kodilla.rsp;

import java.util.Scanner;

class Exit {
    static boolean confirm (Scanner scanner) {
        System.out.println("are you sure, you want to exit?");
        while (true) {
            System.out.println("if yes type y/ if not type n");
            switch (scanner.nextLine()) {
            case "y":
                return true;
            case "n":
                return false;
                default:
                    break;
            }
        }
    }
}
