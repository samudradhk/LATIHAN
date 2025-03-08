package klinik;

public class Veterinarian {
	private String dokter;
	private String bio;

	public Veterinarian(String dokter, String bio) {
		this.dokter = dokter;
		this.bio = bio;
	}
	
	String getDokter() {
		return dokter;
	}
	
	String getBio(){
		return bio;
	}

}
