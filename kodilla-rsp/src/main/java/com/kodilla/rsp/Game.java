package com.kodilla.rsp;

abstract class Game {
    private final Player player;
    private int playerScore = 0;
    private int computerScore = 0;
    private boolean playerLoses;

    Game(Player player) {
        this.player = player;
    }

    abstract void run(int howManyRounds);
}
