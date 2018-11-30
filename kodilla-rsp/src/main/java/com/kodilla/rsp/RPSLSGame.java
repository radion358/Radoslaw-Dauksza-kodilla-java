package com.kodilla.rsp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class RPSLSGame extends Game{
    private Scanner scanner;
    private Move playerMove;
    private final Rock rock = new Rock();
    private final Paper paper = new Paper();
    private final Scissors scissors = new Scissors();
    private final Lizard lizard = new Lizard();
    private final Spock spock = new Spock();

    RPSLSGame(String playerName, Scanner scanner) {
        super(playerName);
        this.scanner = scanner;
    }
    void run(int howManyRounds) {
        List<String> moves = new ArrayList<>();
        moves.add("rock");
        moves.add("paper");
        moves.add("scissors");
        moves.add("lizard");
        moves.add("spock");


        for (int i = 1; i <= howManyRounds; i++) {
            System.out.println("to select a rock, type 1 and press enter");
            System.out.println("to select a paper, type 2 and press enter");
            System.out.println("to select a scissors, type 3 and press enter");
            System.out.println("to select a lizard, type 4 and press enter");
            System.out.println("to select a spock, type 5 and pres enter");
            System.out.println("to quit the game and return to the menu, enter the x and press enter");
            System.out.println("to start the game from begin, enter the n and press enter");
            boolean nedToCheckWhoWin;
            switch (scanner.nextLine()) {
                case "1":
                    playerMove = rock;
                    nedToCheckWhoWin = true;
                    break;
                case "2":
                    playerMove = paper;
                    nedToCheckWhoWin = true;
                    break;
                case "3":
                    playerMove = scissors;
                    nedToCheckWhoWin = true;
                    break;
                case "4":
                    playerMove = lizard;
                    nedToCheckWhoWin = true;
                    break;
                case "5":
                    playerMove = spock;
                    nedToCheckWhoWin = true;
                    break;
                case "x":
                    scanner.close();
                    return;
                case "n":
                    i = 1;
                    nedToCheckWhoWin = false;
                    break;
                default:
                    System.out.println("select correct value");
                    i--;
                    nedToCheckWhoWin = false;
                    break;
            }
            if (nedToCheckWhoWin) {
                whoWin(this, playerMove, moves);
            }
        }
    }
}
