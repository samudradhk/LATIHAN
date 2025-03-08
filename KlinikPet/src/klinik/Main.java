package klinik;

public class Main {

    public Main() {
        
        Veterinarian vet1 = new Veterinarian("Dr. Smith", "Expert in small animals.");
        Veterinarian vet2 = new Veterinarian("Dr. Brown", "Specialist in exotic pets.");

        Pet pet1 = new Pet("Buddy", "P001", vet1);
        Pet pet2 = new Pet("Whiskers", "P002", vet2);

        PetClinic clinic = new PetClinic();

        clinic.admitPet(pet1);
        clinic.admitPet(pet2);

        Owner owner = new Owner("Alice");

        clinic.assignPetToOwner(owner, pet1);
        clinic.assignPetToOwner(owner, pet2);

        owner.displayPets();

        clinic.releasePet(owner, pet1);

        owner.displayPets();

        clinic.displayAdmittedPets();
    }
    public static void main(String[] args) {
    	new Main();
    }
}

/*
Pet admitted to clinic: Buddy
Pet admitted to clinic: Whiskers
Alice brought pet: Buddy
Alice brought pet: Whiskers
Alice's Pets:
Pet: Buddy
ID: P001
Veterinarian: Dr. Smith
Specialty: Expert in small animals.
------------------------
Pet: Whiskers
ID: P002
Veterinarian: Dr. Brown
Specialty: Specialist in exotic pets.
------------------------
Alice took pet home: Buddy
Alice's Pets:
Pet: Whiskers
ID: P002
Veterinarian: Dr. Brown
Specialty: Specialist in exotic pets.
------------------------
Pets still in clinic:
Pet: Buddy
ID: P001
Veterinarian: Dr. Smith
Specialty: Expert in small animals.
------------------------
Pet: Whiskers
ID: P002
Veterinarian: Dr. Brown
Specialty: Specialist in exotic pets.
------------------------
*/
