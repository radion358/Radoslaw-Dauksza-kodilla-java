package com.kodilla.rsp;

import java.util.Scanner;

public class RPSRunner {
    public static void main(String[] args) {
        boolean end = false;
        int howManyRounds = 0;
        Scanner scanner = new Scanner(System.in);
        while(!end){
            System.out.println("enter the name of the player");
            Player player = new Player(scanner.nextLine());
            System.out.println("specify how many rounds would like to play");
            howManyRounds = getHowManyRounds(howManyRounds, scanner);

            boolean menuIsRuning = true;
            while(menuIsRuning){
                System.out.println("select game");
                System.out.println("rock, paper, scissors, choose 1 and pres enter");
                System.out.println("rock, paper, scissors, lizard, spock, choose 2 and pres enter");
                System.out.println("change players name, chose 3 and pres enter");
                System.out.println("change amount of rounds, chose 4 and pres enter");
                System.out.println("to end the game, chose x and pres enter");

                switch(scanner.nextLine()) {
                    case "1":
                        System.out.println("1");
                        RPSGame rpsGame = new RPSGame(player, scanner);
                        rpsGame.run(howManyRounds);

                        break;
                    case "2":
                        System.out.println("2");

                        break;
                    case "3":
                        System.out.println("enter player name");
                        player = new Player(scanner.nextLine());
                        break;
                    case "4":
                        System.out.println("enter how many rounds");
                        howManyRounds = getHowManyRounds(howManyRounds, scanner);
                        break;
                    case "x":
                        if (Exit.confirm(scanner)) {
                            scanner.close();
                            return;
                        }else {
                            break;
                        }
                    default:
                        System.out.println("incorrect choice");
                        break;
                }
            }
            end = true;
        }
    }

    private static int getHowManyRounds(int howManyRounds, Scanner scanner) {
        boolean incorrectInt = true;
        while(incorrectInt) {
            try {
                howManyRounds = Integer.parseInt(scanner.nextLine());
                incorrectInt = false;
            } catch (NumberFormatException e) {
                System.out.println("podaj liczbę");
            }
        }
        return howManyRounds;
    }
}
