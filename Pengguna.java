public class Pengguna{
    private int id;
    private String username;
    private String password;

    public void hapus(){
        System.out.println("DELETE FROM pengguna");
    }
    public void hapus(int id){
        System.out.println("DELETE FROM pengguna WHERE id="+id);
    }
    public void hapus(String username){
        System.out.println("DELETE FROM pengguna WHERE username="+username);
    }
    public void login(){
        System.out.println("ini method untuk login");
    }
    public void lupaPassword(){
        System.out.println("ini method lupa password");
    }
    public void daftar(){
        System.out.println("ini method Daftar user baru ");
    }
    public int getid(){
        return this.id;
    }
    public int geUsername(){
        return this.username;
    }
    public void setid(int id){
        this.id=id;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public Pengguna(){
        System.out.println("Object telah diciptakan, construktor berjalan");
    }
    public void login(String tokenGoogke){
        System.out.println("ini login menggunakan Google");
    }
}