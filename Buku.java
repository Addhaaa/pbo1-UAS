public class Buku {
    private int id;
    private String judul;
    private String pengarang;
    private String penerbit;

    public void hapus() {
        System.out.println("DELETE FROM buku");
    }

    public void hapus(int id) {
        System.out.println("DELETE FROM buku WHERE id=" + id);
    }

    public void hapus(String judul) {
        System.out.println("DELETE FROM buku WHERE judul='" + judul + "'");
    }

    public void pinjam() {
        System.out.println("Peminjaman buku");
    }

    public void kembalikan() {
        System.out.println("Pengembalian buku");
    }

    public void tambah() {
        System.out.println("Menambahkan buku baru");
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

    public Buku() {
        System.out.println("Objek Buku telah diciptakan, constructor berjalan");
    }

    public void pinjam(String kodeTransaksi) {
        System.out.println("Peminjaman buku dengan kode transaksi: " + kodeTransaksi);
    }
}
