package com.kodilla.exception.test;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightFinder {
    static String findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warszawa Okęcie", true);
        airports.put("Modlin", true);
        airports.put("Wrocław", true);
        airports.put("Poznań Ławica", true);
        airports.put("Kraków Balice", true);
        airports.put("Katowice Pyrzowice", true);
        airports.put("Łódź Lublinek", true);
        airports.put("Gdańsk Rębiechowo", true);
        airports.put("Bydgoszcz", true);
        airports.put("Rzeszów Jasionka", true);
        airports.put("Szczecin", true);
        airports.put("Zielona Góra", true);

        boolean flightExist = airports.containsKey(flight.getArrivalAirpor())
                && airports.containsKey(flight.getDepartureAirport());

        if (flightExist) {
            return "Flight from " + flight.getDepartureAirport() + " to " +
                    flight.getArrivalAirpor() + "departure at " + LocalTime.now().plusHours(3);
        } else {
            throw new RouteNotFoundException("Flight does not exist");
        }
    }

    public static void main(String[] args) {
        Flight flight1 = new Flight("Warszawa Okęcie", "Kraków Balice" );
        Flight flight2 = new Flight("Katowice Pyrzowice", "Bukareszt");

        List<Flight> flightList = new ArrayList<>();
        flightList.add(flight1);
        flightList.add(flight2);


        try {
            for (Flight flight : flightList) {
                System.out.println(FlightFinder.findFilght(flight));
            }
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("we are constantly expanding our airlines, " +
                    "so if the flight you are looking for does not exist, " +
                    "we will try to remedy this in the future.");
        }
    }
}
