package com.kodilla.rsp;

class Player {
    private final String name;
    private int wins = 0;

    Player(String name){
        this.name = name;
    }

    String getName() {
        return name;
    }

    int getWins() {
        return wins;
    }

    void setWins(int wins) {
        this.wins = wins;
    }


}
