package pl.javastart.Agregacja_Ex1;

public class Person {
    String firstName, lastName, pesel;

    public Person(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person first name " + firstName +
                ", last mame " + lastName +
                ", pesel " + pesel;
    }
}
