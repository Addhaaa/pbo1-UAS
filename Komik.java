public class Komik {
    private int id;
    private String judul;
    private String pengarang;
    private String penerbit;

    public void hapus() {
        System.out.println("DELETE FROM komik");
    }

    public void hapus(int id) {
        System.out.println("DELETE FROM komik WHERE id=" + id);
    }

    public void hapus(String judul) {
        System.out.println("DELETE FROM komik WHERE judul='" + judul + "'");
    }

    public void baca() {
        System.out.println("Membaca komik");
    }

    public void beli() {
        System.out.println("Membeli komik");
    }

    public void tambah() {
        System.out.println("Menambahkan komik baru");
    }

    public int getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public Komik() {
        System.out.println("Objek Komik telah diciptakan, constructor berjalan");
    }

    public void baca(String pembaca) {
        System.out.println("Membaca komik oleh " + pembaca);
    }
}
