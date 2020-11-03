package pl.javastart.ArraysLibrary;

import java.util.Objects;

public class Person {

    private final String firstName;
    private final String lastName;
    private final String pesel;

    public Person(String firstName, String lasatName, String pesel) {
        this.firstName = firstName;
        this.lastName = lasatName;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPesel() {
        return pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(pesel, person.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, pesel);
    }

    @Override
    public String toString() {
        return "Person " +
                "first name " + firstName +
                ", last name " + lastName +
                ", pesel " + pesel;
    }
}
