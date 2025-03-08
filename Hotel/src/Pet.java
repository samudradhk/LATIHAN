public class Pet {
    private String name;
    private String id;
    private String type;
    private Shelter shelter;

    public Pet(String name,String id,String type, Shelter shelter){
        this.name = name;
        this.id = id;
        this.type = type;
        this.shelter = shelter;
        
    }
    String getName(){
        return name;
    }

    void display(){
        System.out.println("Name: " +name);
        System.out.println("ID: " +id);
        System.out.println("Type: " +type);
        System.out.println("Shelter: " +shelter.getPlace());
        System.out.println("Description: " +shelter.getDesc());
        System.out.println("------------------------------------");
    }
}
