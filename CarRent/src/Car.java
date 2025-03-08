public class Car {
    private String name;
    private String id;
    private Manufacturer manufacturer;

    Car(String name, String id, Manufacturer manufacturer){
        this.name = name;
        this.id = id;
        this.manufacturer = manufacturer;
    }

    public String getName(){
        return name;
    }

    String getId(){
        return id;
    }

    Manufacturer getManuf(){
        return manufacturer;
    }

    void printName(){
        System.out.println("Model: "+ name);
        System.out.println("Id: "+ id);
        System.out.println("Manufactur: "+ manufacturer.getToko());
        System.out.println("Description: "+ manufacturer.getBio());
        System.out.println("-----------------------------------------");
    }
}
