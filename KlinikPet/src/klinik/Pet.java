package klinik;

public class Pet {
	private String name;
	private String id;
	private Veterinarian veterinarian;

	public Pet(String name,String id,Veterinarian veterinarian) {
		this.name = name;
		this.id = id;
		this.veterinarian = veterinarian;
	}
	
	String getName() {
		return name;
	}
	
	void display() {
		System.out.println("Pet: "+name);
		System.out.println("ID: "+id);
		System.out.println("Veterinarian: "+veterinarian.getDokter());
		System.out.println("Pet: "+veterinarian.getBio());
		System.out.println("----------------------------");
	}

}
