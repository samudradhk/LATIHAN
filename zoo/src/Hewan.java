public class Hewan {
    String namaHewan;
    String jenisHewan;
    int umur;
    public Hewan(String namaHewan, String jenisHewan, int umur){
        this.namaHewan = namaHewan;
        this.jenisHewan = jenisHewan;
        this.umur = umur;
    }

    public void tampilkanInfo(){
        System.out.println("nama : " +namaHewan+ " | jenis : "+jenisHewan+" | umur : "+umur);
    }
}
