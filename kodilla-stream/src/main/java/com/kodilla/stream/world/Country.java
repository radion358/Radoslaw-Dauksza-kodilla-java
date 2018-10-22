package com.kodilla.stream.world;

import java.math.BigInteger;

public final class Country {
    private final BigInteger peopleQuantity;

    public Country(BigInteger peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
    }

    public BigInteger getPeopleQuantity() {
        return peopleQuantity;
    }
}
