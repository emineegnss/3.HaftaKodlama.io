public class User {
    private int okulNo;
    private String email;
    private String ad;
    private String soyad;
    private String şifre;
    private String dersProgramı;

    public User(int okulNo, String email, String ad, String soyad) {
        this.okulNo = okulNo;
        this.email = email;
        this.ad = ad;
        this.soyad = soyad;


    }


    public int getOkulNo() {
        return okulNo;
    }

    public void setTc(int okulNo) {
        this.okulNo = okulNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAd() {

        return ad;
    }

    public void setAd(String ad) {

        this.ad = ad;
    }

    public String getSoyad() {


        return soyad;
    }

    public void setSoyad(String soyad) {

        this.soyad = soyad;
    }

    public String getŞifre() {

        return şifre;
    }


    public String getDersProgramı() {
        return dersProgramı;
    }

}
