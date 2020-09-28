package pl.javastart.Obj_Ex1;

public class Employee {

    String firstName, lastName, birthDate;
    int seniority;

    public Employee(String firstName, String lastName, String birthDate, int seniority) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.seniority = seniority;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    @Override
    public String toString() {
        return "Employee's first name " + firstName +
                ", last name " + lastName +
                ", birth date  " + birthDate +
                ", seniority " + seniority;
    }
}
