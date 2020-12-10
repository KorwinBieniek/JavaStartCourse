package pl.javastart_zadania.salary_calculator;

public class Main {



    public static void main(String[] args) {
        Employee julio = new Employee("Julia","Saferna",10000000);
        Employee daria = new Employee("Daria","Jagła",1000);

        PaymentCalculator pc = new PaymentCalculator();

        pc.displayPayments(julio);
        pc.displayPayments(daria);
    }
}
