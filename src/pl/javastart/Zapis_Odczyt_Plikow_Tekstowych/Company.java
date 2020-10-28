package pl.javastart.Zapis_Odczyt_Plikow_Tekstowych;

import java.io.Serializable;

public class Company implements Serializable {

    private static final int MAX_SIZE = 3;
    private Employee[] employees = new Employee[MAX_SIZE];

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    public static int getMaxSize() {
        return MAX_SIZE;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Company() {
    }
}
