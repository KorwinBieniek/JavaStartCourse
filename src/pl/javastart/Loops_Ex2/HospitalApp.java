package pl.javastart.Loops_Ex2;

import java.util.Scanner;

public class HospitalApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Hospital hp = new Hospital();

        int choice = 0;

        while(choice != 3)
        {
            choice = input.nextInt();

            switch(choice)
            {
                case 1 -> hp.addPatient();
                case 2 -> hp.printPatients();
                case 3 -> System.out.println("Exiting the program.");

            }
        }

    }

}
