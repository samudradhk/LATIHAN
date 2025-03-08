public class Chef {
    private String name;
    private String biography;

    public Chef(String name,String biography){
        this.name = name;
        this.biography = biography;
    }

    String getName(){
        return name;
    }
    
    String getBiography(){
        return biography;
    }
}
