package com.kodilla.rsp;

import java.util.List;

public class Computer {
    static String calculateComputerMove (boolean playerLoses,
                                       Move playerMove , List<String> moves){
        String computerMove = null;
        if(playerLoses){
            computerMove = RandomMoveGenerator.generateMove(playerMove.getLosesWith());
            return computerMove;
        }else {
            for (String move : playerMove.getLosesWith()) {
                moves.remove(move);
            }
            computerMove = RandomMoveGenerator.generateMove(moves);
            return computerMove;
        }
    }
}
