package com.kodilla.rsp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

abstract class Game {
    private final String playerName;
    private int playerScore;
    private int computerScore;

    Game(String playerName) {
        this.playerName = playerName;
        playerScore = 0;
        computerScore = 0;
    }

    abstract void run(int howManyRounds);

    void whoWin(Game game, Move playerMove, List<String> moves) {
        boolean playerLoses;
        Random isComputerWin = new Random();
        playerLoses = isComputerWin.nextBoolean();
        String computerMove = Computer.calculateComputerMove(game, playerLoses, playerMove, new ArrayList<>(moves));
        if (playerMove.getMoveName().equals(computerMove)){
            System.out.println("your move is : " + playerMove.getMoveName());
            System.out.println("computer move is: " + computerMove);
            System.out.println("there is a tie");
        }else {
            if (playerLoses) {
                computerScore++;
                printResult(playerMove.getMoveName(), computerMove, "computer win");
            } else {
                playerScore++;
                printResult(playerMove.getMoveName(), computerMove, playerName + " win");
            }
        }
    }

    private void printResult(String playerMove, String computerMove, String whoWin) {
        System.out.println("your move is : " + playerMove);
        System.out.println("computer move is: " + computerMove);
        System.out.println(whoWin);
        System.out.println(playerName + ": " + playerScore + " " + "computer: " + computerScore);
    }
}
