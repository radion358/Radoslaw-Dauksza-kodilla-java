package com.kodilla.rsp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RPSGame {
    private final Player player;
    private Scanner scanner;
    private int playerScore = 0;
    private int computerScore = 0;
    private boolean playerLoses;
    private Move playerMove;
    private Move computerMove;
    private final Rock rock = new Rock();
    private final Paper paper = new Paper();
    private final Scissors scissors = new Scissors();

    public RPSGame(Player player, Scanner scanner) {
        this.player = player;
        this.scanner = scanner;
    }
    public void run(int howManyRounds){
        List<String> moves = new ArrayList<>();
        moves.add("rock");
        moves.add("paper");
        moves.add("scissors");

        System.out.println("to select a rock, enter 1 and press enter");
        System.out.println("to select a paper, enter 2 and press enter");
        System.out.println("to select a scissors, enter 3 and press enter");
        System.out.println("to quit the game and return to the menu, enter the x and press enter");
        System.out.println("to start the game from begin, enter the n and press enter");
        for (int i = 1; i <= howManyRounds; i++){
            switch(scanner.nextLine()){
                case "1":
                    playerMove = rock;
                    break;
                case "2":
                    playerMove = paper;
                    break;
                case"3":
                    playerMove = scissors;
                    break;
                case "x":
                    scanner.close();
                    return;
                case "n":
                    i=1;
                    break;

            }
            Resolve.whoWin(playerMove, moves);
        }
    }
}
