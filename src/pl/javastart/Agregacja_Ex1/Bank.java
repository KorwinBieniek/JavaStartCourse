package pl.javastart.Agregacja_Ex1;

public class Bank {
    public static void main(String[] args) {
        Person person = new Person("Jan","Kowalski","99532106643");

        BankAccount ba = new BankAccount(person, 6000.00);

        Credit credit = new Credit(person, 50000, 12000, 0.05, 12);

        System.out.println(person.toString());
        System.out.println(ba.toString());
        System.out.println(credit.toString());
    }
}
