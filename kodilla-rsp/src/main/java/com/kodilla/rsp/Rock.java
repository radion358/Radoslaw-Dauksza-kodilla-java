package com.kodilla.rsp;

import java.util.ArrayList;
import java.util.List;

class Rock implements Move{
    private final List<String> losesWith = new ArrayList<>();

    Rock() {
        this.losesWith.add("spock");
        this.losesWith.add("paper");
    }

    @Override
    public String getMoveName() {
        return "rock";
    }

    @Override
    public List<String> getLosesWith() {
        return new ArrayList<>(losesWith);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rock rock = (Rock) o;

        return losesWith != null ? losesWith.equals(rock.losesWith) : rock.losesWith == null;
    }

    @Override
    public int hashCode() {
        return losesWith != null ? losesWith.hashCode() : 0;
    }
}
