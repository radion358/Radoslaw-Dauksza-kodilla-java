package com.kodilla.rsp;

import java.util.List;

class Computer {
    static String calculateComputerMove (Game game, boolean playerLoses,
                                       Move playerMove , List<String> moves) {
        String computerMove;
        List<String> availableMove = playerMove.getLosesWith();
        if(playerLoses){
            if (game instanceof RPSGame) {
                computerMove = generateMove(availableMove);
            }else {
                computerMove = RandomMoveGenerator.generateMove(availableMove);
            }
            return computerMove;
        }else {
            for (String move : playerMove.getLosesWith()) {
                moves.remove(move);
            }
            if (game instanceof RPSGame) {
                computerMove = generateMove(moves);
            }else {
                computerMove = RandomMoveGenerator.generateMove(moves);
            }
            return computerMove;
        }
    }
    private static String generateMove(List<String> moves) {
        moves.remove("lizard");
        moves.remove("spock");
        return RandomMoveGenerator.generateMove(moves);
    }
}
