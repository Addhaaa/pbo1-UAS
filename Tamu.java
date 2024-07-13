public class Tamu extends Pengguna {
    private int sisaMasaAktif;

    public void menambahkanMasaAktif(int tambahan) {
        this.sisaMasaAktif = this.sisaMasaAktif + tambahan;
    }

    @Override
    public void hapus() {
        System.out.println("DELETE FROM pengguna WHERE status='Tamu'");
    }

    @Override
    public void login() {
        System.out.println("Login sebagai tamu");
    }

    public int getSisaMasaAktif() {
        return sisaMasaAktif;
    }

    public void setSisaMasaAktif(int sisaMasaAktif) {
        this.sisaMasaAktif = sisaMasaAktif;
    }

    public Tamu() {
        super(); // Call superclass constructor
        System.out.println("Objek Tamu telah diciptakan, constructor berjalan");
    }

    public void login(String token) {
        System.out.println("Login sebagai tamu dengan token: " + token);
    }
}
