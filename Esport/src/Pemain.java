public class Pemain {
    String nama;
    String role;

    public Pemain(String nama,String role){
        this.nama = nama;
        this.role = role;
    }
    public void tampilkanInfo(){
        System.out.println("nama : " +nama+ " role : " +role);
    }
}
