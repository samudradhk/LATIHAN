package gymsystem;
import java.util.*;
public class Gym {
	public List<Pokemon> pokes = new ArrayList<>();
	
	void addPokemon(Pokemon pokemon) {
		pokes.add(pokemon);
		System.out.println("Pokemon added to gym: "+pokemon.getName());
	}
	
	void displayPokemons() {
		System.out.println("Gym Pokemons:");
		for(Pokemon pokemon:pokes) {
			pokemon.display();
		}
	}
}
