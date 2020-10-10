package pl.javastart.Exceptions_Ex1;

import java.util.Scanner;

public class Calculations {

    private Scanner input = new Scanner(System.in);
    private double a;
    private double b;


    static double calculate(double a, double b, char choice) throws UnknownOperatorException {
        double result;

        switch(choice)
        {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' ->
                    {
                        if(b == 0)
                            throw new ArithmeticException("You cannot divide by 0");
                        result = a / b;
                    }
            default -> throw new UnknownOperatorException("There is no such operation available");
        }
        return result;
    }


}
