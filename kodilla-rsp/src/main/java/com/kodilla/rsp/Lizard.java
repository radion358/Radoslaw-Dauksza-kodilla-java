package com.kodilla.rsp;

import java.util.ArrayList;
import java.util.List;

class Lizard implements Move {
    private final List<String> losesWith = new ArrayList<>();

    Lizard() {
        this.losesWith.add("scissors");
        this.losesWith.add("rock");
    }

    @Override
    public String getMoveName(){

        return "lizard";
    }

    @Override
    public List<String> getLosesWith() {
        return new ArrayList<>(losesWith);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lizard lizard = (Lizard) o;

        return losesWith != null ? losesWith.equals(lizard.losesWith) : lizard.losesWith == null;
    }

    @Override
    public int hashCode() {
        return losesWith != null ? losesWith.hashCode() : 0;
    }
}
