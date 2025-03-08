public class Main {
    public Main() {
        PetAdoptionCenter petCenter = new PetAdoptionCenter();
        
        // Menambahkan hewan ke pusat adopsi
        Shelter dogShelter = new Shelter("Happy Paws", "A place for rescued dogs.");
        Shelter catShelter = new Shelter("Whisker Haven", "A sanctuary for homeless cats.");
        
        Pet pet1 = new Pet("Buddy", "P001", "Dog", dogShelter);
        Pet pet2 = new Pet("Mittens", "P002", "Cat", catShelter);
        
        petCenter.addPet(pet1);
        petCenter.addPet(pet2);
        
        // Membuat  adopter
        Adopter alice = new Adopter("Alice");
        
        // Alice mengadopsi hewan peliharaan
        petCenter.adoptPet(alice, pet1);
        petCenter.adoptPet(alice, pet2);
        
        // Menampilkan hewan yang diadopsi Alice
        alice.displayAdoptedPets();
        
        // Alice mengembalikan salah satu hewan
        petCenter.returnPet(alice, pet1);
        
        // Menampilkan hewan yang masih diadopsi Alice
        alice.displayAdoptedPets();
        
        // Menampilkan hewan yang tersedia untuk diadopsi
        petCenter.displayAvailablePets();
    }
    
    public static void main(String[] args) {
        new Main();
    }
}

/*
Pet added to adoption center: Buddy
Pet added to adoption center: Mittens
Alice adopted: Buddy
Alice adopted: Mittens
Alice's Adopted Pets:
Name: Buddy
ID: P001
Type: Dog
Shelter: Happy Paws
Description: A place for rescued dogs.
------------------------
Name: Mittens
ID: P002
Type: Cat
Shelter: Whisker Haven
Description: A sanctuary for homeless cats.
------------------------
Alice returned: Buddy
Alice's Adopted Pets:
Name: Mittens
ID: P002
Type: Cat
Shelter: Whisker Haven
Description: A sanctuary for homeless cats.
------------------------
Pets available for adoption:
Name: Buddy
ID: P001
Type: Dog
Shelter: Happy Paws
Description: A place for rescued dogs.
------------------------

 */