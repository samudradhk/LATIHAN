package klinik;
import java.util.*;
public class Owner {
	private String pemilik;
	public List<Pet> ownerHave = new ArrayList<>();
	
	public Owner(String pemilik) {
		this.pemilik = pemilik;
	}
	
	void displayPets(){
		System.out.println(pemilik+"'s Pets:");
		for(Pet pet:ownerHave) {
			pet.display();
		}
	}
	
	String getPemilik() {
		return pemilik;
	}

}
