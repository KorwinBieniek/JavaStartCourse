package pl.javastart.Exceptions_Ex1;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Calculations calc = new Calculations();

        boolean readComplete = false;

        while(!readComplete)
        {
            try
            {
                System.out.println("Enter first number");
                double a = input.nextDouble();
                System.out.println("Enter second number");
                double b = input.nextDouble();
                System.out.println("Enter an operator");
                char operator = input.next().charAt(0);
                System.out.println(Calculations.calculate(a, b, operator));
                readComplete = true;
            }
            catch(UnknownOperatorException | ArithmeticException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
