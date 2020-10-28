package pl.javastart.Zapis_Odczyt_Plikow_Tekstowych;

public class Employee extends Person{
    private final int salary;

    public Employee(String firstName, String lastName, int salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
