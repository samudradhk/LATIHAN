import java.util.ArrayList;

public class KebunBinatang {
    private String namaZoo;
    private ArrayList<Penjaga> listPenjaga;
    private ArrayList<Hewan> listHewan;

    public KebunBinatang(String namaZoo){
        this.namaZoo = namaZoo;
        this.listPenjaga = new ArrayList<>();
        this.listHewan = new ArrayList<>();
    }
    public void tambahHewan(Hewan hewan){
        listHewan.add(hewan);
    }
    public void tambahPenjaga(Penjaga penjaga){
        listPenjaga.add(penjaga);
    }

    public void tampilkanSemuaHewan(){
        System.out.println("semua hewannya adalah :");
        for(Hewan h : listHewan){
            h.tampilkanInfo();
        }
    }

    public void tampilkanSemuaPenjaga(){
        System.out.println("\nsemua penjaganya adalah :");
        for(Penjaga p : listPenjaga){
            p.tampilkanList();
        }
    }
}
