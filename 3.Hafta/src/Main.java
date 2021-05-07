public class Main {

    public static void main(String[] args) {
        Instructor instructor = new Instructor(999417551,"güncel@gmail.com","Güncel", "Kaya");
        Student student = new Student(15426122,"emine@gmail.com","Emine","Güneş");
        student.setDevamsızlık(3);
        student.setPuan(75);


        InstructorManager instructorManager = new InstructorManager();
        StudentManager studentManager = new StudentManager();
        instructorManager.giriş(instructor);
        instructorManager.bilgiGetir(instructor);
        instructorManager.dersProgramıGetir(instructor);

        instructorManager.çıkış(instructor);
        System.out.println("---------------------------------------");
        studentManager.giriş(student);
        studentManager.bilgiGetir(student);
        studentManager.devamBilgisi(student);
        studentManager.dersProgramıGetir(student);
        studentManager.dersler(student);
        studentManager.puan(student);
        studentManager.çıkış(student);
    }
}
