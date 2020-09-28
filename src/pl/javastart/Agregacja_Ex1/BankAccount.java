package pl.javastart.Agregacja_Ex1;

public class BankAccount {
    Person owner;
    double balance;

    public BankAccount(Person owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount " +
                "owner " + owner.firstName + " " + owner.lastName + " pesel: " + owner.pesel +
                ", balance " + balance;
    }
}
