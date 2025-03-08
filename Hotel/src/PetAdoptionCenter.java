import java.util.ArrayList;
import java.util.List;
public class PetAdoptionCenter {
    private List<Pet> pets = new ArrayList<>();

    void addPet(Pet pet){
        pets.add(pet);
        System.out.println("Pet added to adoption center: " + pet.getName());
    }

    void adoptPet(Adopter adopter,Pet pet){
        adopter.adopted.add(pet);
        pets.remove(pet);
        System.out.println(adopter.getOwner()+" adopted: "+pet.getName());
    }

    void returnPet(Adopter adopter, Pet pet){
        adopter.adopted.remove(pet);
        pets.add(pet);
        System.out.println(adopter.getOwner()+" returned: "+pet.getName());
    }
    void displayAvailablePets(){
        for(Pet pet:pets){
            System.out.println("Pets available for adoption:");
            pet.display();
        }
    }
}
