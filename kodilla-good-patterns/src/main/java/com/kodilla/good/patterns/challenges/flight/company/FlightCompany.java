package com.kodilla.good.patterns.challenges.flight.company;

import java.util.List;
import java.util.stream.Collectors;

public class FlightCompany {
    private List<Flight> flights;

    public FlightCompany(List<Flight> flights) {
        this.flights = flights;
    }

    public List<Flight> searchFlight(Flight flight) {
        final List<Flight> searchedFlights;
        searchedFlights = flights.stream().filter(f -> f.equals(flight))
                .collect(Collectors.toList());
        if (searchedFlights.size() != 0) {
            return searchedFlights;
        }else {
            flights.stream().filter(f -> f.getDepartureDestination().equals(flight.getDepartureDestination()))
                    .collect(Collectors.toList())
                    .forEach(f -> searchedFlights.addAll(searchFlight(new Flight(f.getArrivalDestination(), flight.getArrivalDestination()))));
            return searchedFlights;
        }
    }

    public List<Flight> searchFlightByDepartureDestination(String departureDestination) {
        return flights.stream()
                .filter(flight -> flight.getDepartureDestination().equals(departureDestination))
                .collect(Collectors.toList());
    }

    public List<Flight> searchFlightByArrivalDestination(String arrivalDestination) {
        return flights.stream()
                .filter(flight -> flight.getArrivalDestination().equals(arrivalDestination))
                .collect(Collectors.toList());
    }
}
