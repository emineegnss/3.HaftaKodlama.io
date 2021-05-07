public class InstructorManager extends UserManager{
    public void bilgiGetir(Instructor instructor){
        System.out.println(instructor.getAd() + " " + instructor.getSoyad() + " " + instructor.getEmail() + " Verdiği dersler:"
                + instructor.getVerdiğiDersler());
    }



}
