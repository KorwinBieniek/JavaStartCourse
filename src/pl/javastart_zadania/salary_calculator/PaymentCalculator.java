package pl.javastart_zadania.salary_calculator;

public class PaymentCalculator {
    private static final int MONTHS = 12;
    private static final int MONTHLY_ZUS = 1000;

    public long nettoYearPayment(Employee employee){
        return employee.getSalary() * MONTHS;
    }

    public long bruttoYearPayment(Employee employee){
        return (long) ((employee.getSalary() * 0.2 + MONTHLY_ZUS) * MONTHS);
    }

    public void displayPayments(Employee employee){
        System.out.println(employee.getFirstName() + " netto yearly payment: " + nettoYearPayment(employee));
        System.out.println(employee.getFirstName() + " brutto yearly payment: " + bruttoYearPayment(employee));
    }
}
