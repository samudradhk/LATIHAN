package gymsystem;

public class Pokemon {
	private String name;
	private String id;
	private Trainer trainer;
	
	public Pokemon(String name,String id,Trainer trainer) {
		this.name = name;
		this.id = id;
		this.trainer = trainer;
	}
	
	String getName() {
		return name;
	}
	
	void display() {
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Trainer: "+trainer.getTrain());
		System.out.println("Bio: "+trainer.getBio());
		System.out.println("----------------------------------------");
	}

}
