public class Student extends User {
    private double puan;
    private int devamsızlık;
    private String aldığıDersler;
    User user;


    public Student(int okulNo, String email, String ad, String soyad) {

        super(okulNo, email, ad, soyad);
    }

    @Override
    public String getDersProgramı() {
        return "Ders programı Çarşamba günü 8.00 ";
    }

    @Override
    public String getŞifre() {
        return "155" + getAd();
    }

    public double getPuan() {

        return puan;
    }

    public void setPuan(double puan) {

        this.puan = puan;
    }

    public int getDevamsızlık() {

        return  (100 * devamsızlık) / 12;
    }

    public void setDevamsızlık(int devamsızlık) {

        this.devamsızlık = devamsızlık;
    }

    public String getAldığıDersler() {
        return "Fizik ve Veri Bilimi";
    }


}
