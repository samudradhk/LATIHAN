import java.util.ArrayList;
import java.util.List;

public class Adopter {
    private String owner;
    public List<Pet> adopted = new ArrayList<>();

    public Adopter(String owner){
        this.owner = owner;
    }

    String getOwner(){
        return owner;
    }

    void displayAdoptedPets(){
        System.out.println(owner+"'s Adopted Pets:");
        for(Pet pet : adopted){
            pet.display();
        }
    }
}
