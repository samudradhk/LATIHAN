package bandara;

public class Pilot {
	private String pilotName;
	private int jamTerbang;

	public Pilot(String pilotName,int jamTerbang) {
		this.pilotName = pilotName;
		this.jamTerbang = jamTerbang;
	}
	
	String getPilotName() {
		return pilotName;
	}
	
	int getJamTerbang() {
		return jamTerbang;
	}

}
