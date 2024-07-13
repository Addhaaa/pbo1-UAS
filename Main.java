public class Main {
    public static void main(String[]args){
        String variableString;
        Pengguna pengguna = new Pengguna();
        Bebas bebas = new Bebas();
        Buku buku = new Buku();
        Komik komik = new Komik();
        Tamu tamu = new Tamu();
    }
}
public class Tamu extends Pengguna{
    private int sisaMasaAktif;

    public void menambahkanMasaAktif(int tambahan){
        this.sisaMasaAktif = this.sisaMasaAktif + tambahan;
    }
    public void hapus(){
        System.out.println("DELETE FROM pengguna WHERE status='Tamu'");
    }
    public void login(){
        System.out.println("Login sebagai tamu");
    }
}
