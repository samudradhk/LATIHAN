import java.util.ArrayList;

public class Penjaga {
    String name;
    int age;
    ArrayList<Hewan> listHewan;

    public Penjaga(String name, int age){
        this.name = name;
        this.age = age;
        this.listHewan = new ArrayList<>(); 
    }

    public void tambahHewan(Hewan hewan){
        listHewan.add(hewan);
    }

    public void tampilkanList(){
        System.out.println("\nnama penjaga : "+name+" | umur penjaga : "+age);
        for(Hewan h : listHewan){
            h.tampilkanInfo();
        }
    }
}
