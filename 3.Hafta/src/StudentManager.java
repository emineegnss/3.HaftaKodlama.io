public class StudentManager extends UserManager{

    public void bilgiGetir(Student student){
        System.out.println(student.getAd() + " " + student.getSoyad() + " " + student.getEmail() + " aldığı dersler:"
                + student.getAldığıDersler());
    }
    public void devamBilgisi(Student student){
        System.out.println("Devamsızlık yüzdesi: " + student.getDevamsızlık() );
    }
    public void puan(Student student){
        System.out.println(student.getPuan() + " Puan almıştır.");
    }
    public void dersler(Student student){
        System.out.println("Öğrencinin aldığı dersler: " + student.getAldığıDersler() );
    }

}
