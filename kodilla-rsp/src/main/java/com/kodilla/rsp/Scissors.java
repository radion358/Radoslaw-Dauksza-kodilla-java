package com.kodilla.rsp;

import java.util.ArrayList;
import java.util.List;

class Scissors implements Move{
    private final List<String> losesWith = new ArrayList<>();

    Scissors() {
        this.losesWith.add("spock");
        this.losesWith.add("rock");
    }

    @Override
    public String getMoveName(){

        return "scissors";
    }

    @Override
    public List<String> getLosesWith() {
        return new ArrayList<>(losesWith);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Scissors scissors = (Scissors) o;

        return losesWith != null ? losesWith.equals(scissors.losesWith) : scissors.losesWith == null;
    }

    @Override
    public int hashCode() {
        return losesWith != null ? losesWith.hashCode() : 0;
    }
}
