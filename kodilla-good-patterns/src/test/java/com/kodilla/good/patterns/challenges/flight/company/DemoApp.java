package com.kodilla.good.patterns.challenges.flight.company;

public class DemoApp {
    public static void main(String[] args) {
        FlightCompany flightCompany = Generator.generateFlightCompany();

        Flight directFlight = Generator.generateDirectFlight();
        Flight flightWithTransfer = Generator.generateFlightWithTransfer();

        flightCompany.searchFlight(directFlight).forEach(System.out::println);
        flightCompany.searchFlight(flightWithTransfer).forEach(System.out::println);
       flightCompany.searchFlightByArrivalDestination("Rzeszów Jasionka").forEach(System.out::println);
        flightCompany.searchFlightByDepartureDestination("Warszawa Okęcie").forEach(System.out::println);
    }
}
