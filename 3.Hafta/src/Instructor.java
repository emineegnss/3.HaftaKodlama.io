public class Instructor extends User {

    User user;
    private String verdiğiDersler;

    public Instructor(int okulNo, String email, String ad, String soyad) {
        super(okulNo, email, ad, soyad);
    }

    @Override
    public String getŞifre() {
        return "999" + getSoyad();
    }

    @Override
    public String getDersProgramı() {
        return "Ders Saati Salı Günü 14.50 ";
    }

    public String getVerdiğiDersler() {
        return "Algoritma ve Mikrobilgisayar";
    }


}
