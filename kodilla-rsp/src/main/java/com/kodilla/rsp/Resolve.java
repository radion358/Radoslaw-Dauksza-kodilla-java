package com.kodilla.rsp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Resolve {
    static void whoWin(Game game, Move playerMove, List<String> moves) {
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
                System.out.println("your move is : " + playerMove.getMoveName());
                System.out.println("computer move is: " + computerMove);
                System.out.println("you win");
            } else {
                System.out.println("your move is : " + playerMove.getMoveName());
                System.out.println("computer move is: " + computerMove);
                System.out.println("you lose");

            }
        }
    }
}
