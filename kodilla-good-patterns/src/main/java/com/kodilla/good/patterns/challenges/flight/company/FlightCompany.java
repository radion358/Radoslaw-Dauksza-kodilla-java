package com.kodilla.good.patterns.challenges.flight.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightCompany {
    private List<Flight> flights;
    private List<Flight> searchedFlights = new ArrayList<>();

    public FlightCompany(List<Flight> flights) {
        this.flights = flights;
    }

    List<Flight> searchFlight(Flight flight) {
        final List<Flight> tempSearchedFlights;
        tempSearchedFlights = flights.stream().filter(f -> f.equals(flight))
                .collect(Collectors.toList());
           if(tempSearchedFlights.size() == 0) {
            flights.stream().filter(f -> f.getDepartureDestination().equals(flight.getDepartureDestination()))
                    .collect(Collectors.toList())
                    .forEach(f ->  {
                        tempSearchedFlights.add(f);
                        tempSearchedFlights.addAll(searchFlight(new Flight(f.getArrivalDestination(),
                                flight.getArrivalDestination())));
                    });
        }
           tempSearchedFlights.stream().filter(f -> searchedFlights.contains(f)).forEach(searchedFlights::remove);
           searchedFlights.addAll(tempSearchedFlights);
           tempSearchedFlights.clear();
           tempSearchedFlights.addAll(searchedFlights);
           searchedFlights.clear();
        return tempSearchedFlights;
    }

    List<Flight> searchFlightByDepartureDestination(String departureDestination) {
        return flights.stream()
                .filter(flight -> flight.getDepartureDestination().equals(departureDestination))
                .collect(Collectors.toList());
    }

    List<Flight> searchFlightByArrivalDestination(String arrivalDestination) {
        return flights.stream()
                .filter(flight -> flight.getArrivalDestination().equals(arrivalDestination))
                .collect(Collectors.toList());
    }
}
