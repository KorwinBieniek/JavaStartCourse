package pl.javastart.Maps;


import java.util.InputMismatchException;
import java.util.Scanner;

public class CompanyApp {

    static Scanner input = new Scanner(System.in);
    public static final int EXIT = 0;
    public static final int ADD = 1;
    public static final int FIND = 2;
    public static final int PRINT = 3;

    public static void main(String[] args) {
        int choice;

        do {
            choice = input.nextInt();
            switch (choice) {
                case ADD -> Company.addEmployee();
                case FIND -> {
                    System.out.println("Input name and surname of the employee that you want to find");
                    input.nextLine();
                    String find = input.nextLine();
                    Company.findEmployee(find);
                }
                case PRINT -> Company.print();
                case EXIT -> System.out.println("Goodbye!");
            }
        } while (choice != EXIT);
    }


}
