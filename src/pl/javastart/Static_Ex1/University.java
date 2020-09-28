package pl.javastart.Static_Ex1;

public class University {
    public static void main(String[] args) {

        System.out.println(Student.getStudent_count());

        Student student1 = new Student("Korwin","Bieniek","11");
        Student student2 = new Student("Niwrok","KeineiB","22");

        System.out.println(Student.getStudent_count());
    }
}
