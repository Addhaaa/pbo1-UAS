public class Bebas {
    private int id;
    private String nama;
    private String keterangan;

    public void hapus() {
        System.out.println("DELETE FROM bebas");
    }

    public void hapus(int id) {
        System.out.println("DELETE FROM bebas WHERE id=" + id);
    }

    public void hapus(String nama) {
        System.out.println("DELETE FROM bebas WHERE nama='" + nama + "'");
    }

    public void proses() {
        System.out.println("Proses data bebas");
    }

    public void tambah() {
        System.out.println("Menambahkan data baru");
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Bebas() {
        System.out.println("Objek Bebas telah diciptakan, constructor berjalan");
    }

    public void proses(String token) {
        System.out.println("Proses menggunakan token: " + token);
    }
}
