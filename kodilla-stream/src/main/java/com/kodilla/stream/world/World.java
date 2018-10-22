package com.kodilla.stream.world;

import java.math.BigInteger;
import java.util.List;

public class World {
    private final List<Continent> continents;

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    BigInteger getPeopleQuantity() {
        return continents.stream()
                .flatMap( continent -> continent.getCountries().stream())
                .map(Country:: getPeopleQuantity)
                .reduce(BigInteger.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
