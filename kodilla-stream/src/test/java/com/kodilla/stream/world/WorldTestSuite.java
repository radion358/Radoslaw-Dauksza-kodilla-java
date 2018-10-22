package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        List<Country> countriesInEurope = new ArrayList<>();
        countriesInEurope.add(new Country(new BigInteger("1234567890")));
        countriesInEurope.add(new Country(new BigInteger("1234567890")));

        List<Country> countriesInAsia = new ArrayList<>();
        countriesInEurope.add(new Country(new BigInteger("1234567890")));
        countriesInEurope.add(new Country(new BigInteger("1234567890")));
        countriesInEurope.add(new Country(new BigInteger("1234567890")));

        List<Country> countriesInAfrica = new ArrayList<>();
        countriesInEurope.add(new Country(new BigInteger("1234567890")));
        countriesInEurope.add(new Country(new BigInteger("1234567890")));


        Continent europe = new Continent(countriesInEurope);
        Continent asia = new Continent(countriesInAsia);
        Continent africa = new Continent(countriesInAfrica);

        List<Continent> continents = new ArrayList<>();
        continents.add(europe);
        continents.add(asia);
        continents.add(africa);

        World world = new World(continents);

        //When
        BigInteger totalQuantityOfPeople = world.getPeopleQuantity();
        BigInteger expectedQuantityOfPeople = new BigInteger("8641975230");

        //Then
        Assert.assertEquals(expectedQuantityOfPeople, totalQuantityOfPeople);
    }
}
