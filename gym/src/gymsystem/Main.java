package gymsystem;

public class Main {

    public Main() {
        // Membuat objek Trainer
        Trainer trainer1 = new Trainer("Ash Ketchum", "Pokemon Master from Pallet Town.");
        Trainer trainer2 = new Trainer("Misty", "Water-type Pokemon expert.");

        // Membuat objek Pokemon
        Pokemon pokemon1 = new Pokemon("Pikachu", "P001", trainer1);
        Pokemon pokemon2 = new Pokemon("Starmie", "P002", trainer2);

        // Membuat objek Gym dan menambahkan Pokemon
        Gym gym = new Gym();
        gym.addPokemon(pokemon1);
        gym.addPokemon(pokemon2);

        // Membuat objek Trainer untuk bertarung
        Trainer challenger = new Trainer("Brock");

        // Menantang gym
        challenger.challengePokemon(pokemon1, gym);
        
        // Menampilkan Pokemon yang ditantang
        challenger.displayChallengedPokemon();

        // Menyerah dalam tantangan
        challenger.giveUpChallenge(pokemon1, gym);

        // Menampilkan daftar Pokemon di gym
        gym.displayPokemons();
    }

    public static void main(String[] args) {
        new Main();
    }

}

/*
Pokemon added to gym: Pikachu  
Pokemon added to gym: Starmie  
Brock challenged: Pikachu  
Brock's Challenged Pokemon:  
Name: Pikachu  
ID: P001  
Trainer: Ash Ketchum  
Bio: Pokemon Master from Pallet Town.  
------------------------  
Brock gave up the challenge: Pikachu  
Gym Pokemons:  
Name: Pikachu  
ID: P001  
Trainer: Ash Ketchum  
Bio: Pokemon Master from Pallet Town.  
------------------------  
Name: Starmie  
ID: P002  
Trainer: Misty  
Bio: Water-type Pokemon expert.  
------------------------

*/
