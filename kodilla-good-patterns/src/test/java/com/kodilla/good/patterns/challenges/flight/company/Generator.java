package com.kodilla.good.patterns.challenges.flight.company;

import java.util.ArrayList;
import java.util.List;

public class Generator {
    static FlightCompany generateFlightCompany() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warszawa Okęcie", "Modlin"));
        flights.add(new Flight("Poznań Ławica", "Kraków Balice"));
        flights.add(new Flight("Katowice Pyrzowice", "Łódź Lublinek"));
        flights.add(new Flight("Gdańsk Rębiechowo", "Bydgoszcz"));
        flights.add(new Flight("Rzeszów Jasionka", "Szczecin"));
        flights.add(new Flight("Zielona Góra","Szczecin"));
        flights.add(new Flight("Szczecin", "Rzeszów Jasionka"));
        flights.add(new Flight("Bydgoszcz","Rzeszów Jasionka"));
        flights.add(new Flight("Warszawa Okęcie", "Łódź Lublinek"));

        return new FlightCompany(flights);
    }

    static Flight generateDirectFlight() {
        return new Flight("Warszawa Okęcie", "Modlin");
    }

    static Flight generateFlightWithTransfer() {
        return new Flight("Gdańsk Rębiechowo", "Szczecin");
    }
}
