package bandara;
import java.util.*;
public class Passenger {
	private String name;
	public List<Flight> buking = new ArrayList<>();

	public Passenger(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	void displayBookings() {
		System.out.println(name+"'s Bookings:");
		for(Flight flight:buking) {
			flight.display();
		}
	}

}
