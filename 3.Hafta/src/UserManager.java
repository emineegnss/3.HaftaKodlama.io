public class UserManager {
    public void giriş(User user){
        System.out.println(user.getAd() + " " + user.getSoyad() + " : Girişiniz sağlandı..");

    }
    public void çıkış(User user){
        System.out.println(user.getAd() + " " + user.getSoyad() + " : Çıkışınız sağlandı..");
    }
    public void dersProgramıGetir(User user){
        System.out.println("Ders takviminiz: "+ user.getDersProgramı() );
    }





}
