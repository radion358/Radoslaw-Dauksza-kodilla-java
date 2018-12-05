package com.kodilla.good.patterns.challenges.flight.company;

public class Flight {
    private String departureDestination;
    private String arrivalDestination;

    Flight(String departureDestination, String arrivalDestination) {
        this.departureDestination = departureDestination;
        this.arrivalDestination = arrivalDestination;
    }

    String getDepartureDestination() {
        return departureDestination;
    }

    String getArrivalDestination() {
        return arrivalDestination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!departureDestination.equals(flight.departureDestination)) return false;
        return arrivalDestination.equals(flight.arrivalDestination);
    }

    @Override
    public int hashCode() {
        int result = departureDestination.hashCode();
        result = 31 * result + arrivalDestination.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight from " + departureDestination + " to " + arrivalDestination;
    }
}
