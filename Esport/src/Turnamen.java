import java.util.ArrayList;

public class Turnamen {
    String nameTurnamen;
    ArrayList <Tim> daftarTim;

    public Turnamen(String nameTurnamen){
        this.nameTurnamen = nameTurnamen;
        this.daftarTim = new ArrayList<>();
    }

    public void tambahTim(Tim tim){
        daftarTim.add(tim);
    }

    public void tampilkanKlasemen(){
        System.out.println("nama turnamen : " +nameTurnamen);
        for(Tim t : daftarTim){
            System.out.println(t.getScore() + " - " + t.nameTim);
        }
    }
}
