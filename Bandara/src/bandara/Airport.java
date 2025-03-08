package bandara;
import java.util.*;
public class Airport {
	private List<Flight> flights = new ArrayList<>();

	
	void addFlight(Flight flight) {
		flights.add(flight);
		System.out.println("Flight added to airport: Flight "+flight.getId()+" to "+flight.getKota());
	}
	
	void bookFlight(Passenger passenger, Flight flight) {
		passenger.buking.add(flight);
		System.out.println(passenger.getName()+" booked flight: Flight "+flight.getId()+ " to " +flight.getKota());
	}
	
	void cancelBooking(Passenger passenger, Flight flight) {
		passenger.buking.remove(flight);
		System.out.println(passenger.getName()+" canceled flight: Flight "+flight.getId()+ " to " +flight.getKota());
	}
	
	void displayFlights() {
		System.out.println("Flights available at Airport:");
		for(Flight flight:flights) {
			flight.display();
		}
	}

}
