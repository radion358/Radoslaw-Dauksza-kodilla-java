package com.kodilla.rsp;

import java.util.ArrayList;
import java.util.List;

class Spock implements Move{
    private final List<String> losesWith = new ArrayList<>();

    Spock() {
        this.losesWith.add("paper");
        this.losesWith.add("lizard");
    }

    @Override
    public String getMoveName(){

        return "spock";
    }

    @Override
    public List<String> getLosesWith() {
        return new ArrayList<>(losesWith);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Spock spock = (Spock) o;

        return losesWith != null ? losesWith.equals(spock.losesWith) : spock.losesWith == null;
    }

    @Override
    public int hashCode() {
        return losesWith != null ? losesWith.hashCode() : 0;
    }
}
