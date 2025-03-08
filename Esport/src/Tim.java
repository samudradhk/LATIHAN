import java.util.*;

public class Tim {
    private ArrayList <Pemain> anggota;
    String nameTim;
    int skor;
    public Tim(String nameTim){
        this.nameTim = nameTim;
        this.anggota = new ArrayList<>();
        this.skor = 0;
    }

    public void tambahPemain(Pemain pemain){
        anggota.add(pemain);
    }

    public void tambahSkor(int nilai){
        skor += nilai;
    }

    public void tampilkanInfo(){
        System.out.println("nama tim : " +nameTim+ "| skor : " +skor);
        for(Pemain p:anggota){
            p.tampilkanInfo();
        }
    }

    public int getScore(){
        return skor;
    }
}
