public class Main {
    public Main(){
        // Membuat pemain
        Pemain p1 = new Pemain("Jojo", "DPS");
        Pemain p2 = new Pemain("Lili", "Support");
        Pemain p3 = new Pemain("Budi", "Tank");

        // Membuat tim
        Tim timA = new Tim("Phoenix Squad");
        timA.tambahPemain(p1);
        timA.tambahPemain(p2);
        timA.tambahSkor(100);

        Tim timB = new Tim("Shadow Hunters");
        timB.tambahPemain(p3);
        timB.tambahSkor(150);

        // Membuat turnamen
        Turnamen turnamen = new Turnamen("Esports Championship");
        turnamen.tambahTim(timA);
        turnamen.tambahTim(timB);

        // Menampilkan informasi
        timA.tampilkanInfo();
        timB.tampilkanInfo();
        System.out.println();
        turnamen.tampilkanKlasemen();
    }

    public static void main(String [] args){
        new Main();
    }
}
