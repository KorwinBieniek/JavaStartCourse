package pl.javastart.Agregacja_Ex1;

public class Credit {
    Person borrower;
    double cashBorrowed;
    double cashReturned;
    double interestRate;
    int termMonths;

    public Credit(Person borrower, double cashBorrowed, double cashReturned, double interestRate, int termMonths) {
        this.borrower = borrower;
        this.cashBorrowed = cashBorrowed;
        this.cashReturned = cashReturned;
        this.interestRate = interestRate;
        this.termMonths = termMonths;
    }

    @Override
    public String toString() {
        return "Credit borrower " + borrower.firstName + " " + borrower.lastName +
                ", cash borrowed " + cashBorrowed +
                ", cash returned " + cashReturned +
                ", interest rate " + (interestRate*100) + "%" +
                ", term months " + termMonths;
    }
}
