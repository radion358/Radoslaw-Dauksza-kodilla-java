package com.kodilla.rsp;

import java.util.ArrayList;
import java.util.List;

public class Paper implements Move {
    private final List<String> losesWith = new ArrayList<>();

    public Paper() {
        this.losesWith.add("scissors");
        this.losesWith.add("lizard");
    }

    @Override
    public String getMoveName(){

        return "paper";
    }

    @Override
    public List<String> getLosesWith() {
        return losesWith;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paper paper = (Paper) o;

        return losesWith != null ? losesWith.equals(paper.losesWith) : paper.losesWith == null;
    }

    @Override
    public int hashCode() {
        return losesWith != null ? losesWith.hashCode() : 0;
    }
}
