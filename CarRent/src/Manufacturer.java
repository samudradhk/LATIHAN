public class Manufacturer {
    private String toko;
    private String biography;

    Manufacturer(String toko,String biography){
        this.toko = toko;
        this.biography = biography;
    }

    String getToko(){
        return toko;
    }

    String getBio(){
        return biography;
    }
}
