public class Main {
    public Main(){
        // Membuat hewan
        Hewan h1 = new Hewan("Leo", "Singa", 5);
        Hewan h2 = new Hewan("Dumbo", "Gajah", 10);
        Hewan h3 = new Hewan("Kiki", "Monyet", 3);

        // Membuat penjaga
        Penjaga penjaga1 = new Penjaga("Budi", 30);
        penjaga1.tambahHewan(h1);
        penjaga1.tambahHewan(h3);

        Penjaga penjaga2 = new Penjaga("Ani", 28);
        penjaga2.tambahHewan(h2);

        // Membuat kebun binatang
        KebunBinatang kebun = new KebunBinatang("Safari Land");
        kebun.tambahHewan(h1);
        kebun.tambahHewan(h2);
        kebun.tambahHewan(h3);
        kebun.tambahPenjaga(penjaga1);
        kebun.tambahPenjaga(penjaga2);

        // Menampilkan informasi
        kebun.tampilkanSemuaHewan();
        kebun.tampilkanSemuaPenjaga();
    }

    public static void main(String [] args){
        new Main();
    }
}
