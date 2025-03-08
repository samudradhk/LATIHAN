package bandara;

public class Flight {
	private String id;
	private String kota;
	private Pilot pilot;

	public Flight(String id,String kota,Pilot pilot) {
		this.id = id;
		this.kota = kota;
		this.pilot = pilot;
	}
	
	String getId() {
		return id;
	}
	
	String getKota(){
		return kota;
	}
	
	void display() {
		System.out.println("Flight: Flight "+id);
		System.out.println("Destination: "+kota);
		System.out.println("Pilot: "+pilot.getPilotName());
		System.out.println("Experience: "+pilot.getJamTerbang());
		System.out.println("----------------------------------");
	}
	

}
