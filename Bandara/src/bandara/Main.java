package bandara;

public class Main {

    public Main() {
        Pilot pilot1 = new Pilot("Captain Smith", 15);
        Pilot pilot2 = new Pilot("Captain Johnson", 20);

        Flight flight1 = new Flight("101", "New York", pilot1);
        Flight flight2 = new Flight("202", "London", pilot2);

        Airport airport = new Airport();

        airport.addFlight(flight1);
        airport.addFlight(flight2);

        Passenger passenger = new Passenger("John");

        airport.bookFlight(passenger, flight1);
        airport.bookFlight(passenger, flight2);

        passenger.displayBookings();

        airport.cancelBooking(passenger, flight1);

        passenger.displayBookings();

        airport.displayFlights();
    }

    public static void main(String[] args) {
        new Main();
    }

}


/*
Flight added to airport: Flight 101 to New York
Flight added to airport: Flight 202 to London
John booked flight: Flight 101 to New York
John booked flight: Flight 202 to London
John's Bookings:
Flight: Flight 101
Destination: New York
Pilot: Captain Smith
Experience: 15 years
------------------------
Flight: Flight 202
Destination: London
Pilot: Captain Johnson
Experience: 20 years
------------------------
John canceled flight: Flight 101 to New York
John's Bookings:
Flight: Flight 202
Destination: London
Pilot: Captain Johnson
Experience: 20 years
------------------------
Flights available at Airport:
Flight: Flight 101
Destination: New York
Pilot: Captain Smith
Experience: 15 years
------------------------
Flight: Flight 202
Destination: London
Pilot: Captain Johnson
Experience: 20 years
------------------------
*/
