package klinik;
import java.util.*;
public class PetClinic {
	private List<Pet> pets = new ArrayList<>();
	
	void admitPet(Pet pet) {
		pets.add(pet);
		System.out.println("Pet admitted to clinic: "+pet.getName());
	}
	
	void assignPetToOwner(Owner owner, Pet pet) {
		owner.ownerHave.add(pet);
		pets.remove(pet);
		System.out.println(owner.getPemilik()+" brought pet:"+pet.getName());
	}
	
	void releasePet(Owner owner, Pet pet) {
		pets.add(pet);
		owner.ownerHave.remove(pet);
		
		System.out.println(owner.getPemilik()+" took pet home: "+pet.getName());
	}
	
	void displayAdmittedPets() {
		System.out.println("Pets still in clinic:");
		for(Pet pet:pets) {
			pet.display();
		}
	}

}
