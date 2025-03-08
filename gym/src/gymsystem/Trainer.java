package gymsystem;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
	private String train;
	private String bio;
	private String chalange;
	private List<Pokemon> tarung = new ArrayList<>();

	public Trainer(String train,String bio) {
		this.train = train;
		this.bio = bio;
	}
	
	public Trainer(String chalange) {
		this.chalange = chalange;
	}
	
	String getTrain() {
		return train;
	}
	
	String getBio() {
		return bio;
	}
	
	void challengePokemon(Pokemon pokemon,Gym gym) {
		tarung.add(pokemon);
		gym.pokes.remove(pokemon);
		System.out.println(chalange+" challenged: "+pokemon.getName());
	}
	
	void giveUpChallenge(Pokemon pokemon,Gym gym) {
		gym.pokes.add(pokemon);
		tarung.remove(pokemon);
		System.out.println(chalange+" gave up the challenge: "+pokemon.getName());
	}
	
	void displayChallengedPokemon() {
		System.out.println(chalange+"'s Challenged Pokemon:");
		for(Pokemon pokemon:tarung) {
			pokemon.display();
		}
	}

}
