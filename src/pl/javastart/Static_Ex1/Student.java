package pl.javastart.Static_Ex1;

public class Student {
    private String firstName, lastName, indexNumber;
    private static int student_count = 0;

    public static int getStudent_count() {
        return student_count;
    }

    public static void setStudent_count(int student_count) {
        Student.student_count = student_count;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public Student(String firstName, String lastName, String indexNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.indexNumber = indexNumber;
        student_count++;
    }
}
