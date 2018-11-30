package com.kodilla.rsp;

import java.util.Scanner;
import java.util.regex.Pattern;

class RPSRunner {
    public static void main(String[] args) {
        int howManyRounds;
        String playerName = "";
        Scanner scanner = new Scanner(System.in);
        boolean incorrectPlayerName = true;
        while(incorrectPlayerName) {
            System.out.println("enter the name of the player");
            String input = scanner.nextLine();
            if (Pattern.matches("[a-zA-Z]+", input)) {
                playerName = input;
                incorrectPlayerName = false;
            }
        }
        howManyRounds = getHowManyRounds(scanner);

        while(true) {
            System.out.println("select game");
            System.out.println("rock, paper, scissors, choose 1 and pres enter");
            System.out.println("rock, paper, scissors, lizard, spock, choose 2 and pres enter");
            System.out.println("change amount of rounds, chose 3 and pres enter");
            System.out.println("to end the game, chose x and pres enter");

            switch (scanner.nextLine()) {
                case "1":
                    RPSGame rpsGame = new RPSGame(playerName, scanner);
                    rpsGame.run(howManyRounds);
                    break;
                case "2":
                    RPSLSGame rpslsGame = new RPSLSGame(playerName, scanner);
                    rpslsGame.run(howManyRounds);
                    break;
                case "3":
                    System.out.println("enter how many rounds");
                    howManyRounds = getHowManyRounds(scanner);
                    break;
                case "x":
                    if (Exit.confirm(scanner)) {
                        scanner.close();
                        return;
                    } else {
                        break;
                    }
                default:
                    System.out.println("incorrect choice");
                    break;
            }
        }
    }
    private static int getHowManyRounds(Scanner scanner) {
        while (true) {
            System.out.println("specify how many rounds would like to play");
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if (input > 0 && input < 100) {
                    return input;
                }
            }else scanner.next();
        }
    }
}
