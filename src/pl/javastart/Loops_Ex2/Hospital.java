package pl.javastart.Loops_Ex2;

import java.util.Scanner;

public class Hospital {

    Scanner input = new Scanner(System.in);
    private final int MAX_NUMBER_OF_PATIENTS = 1;
    private Patient[] patients = new Patient[MAX_NUMBER_OF_PATIENTS];
    private int current_patients = 0;

    public void addPatient()
    {
        System.out.println("Enter patient's name: ");
        String firstName = input.next();
        System.out.println("Enter patient's last name: ");
        String lastName = input.next();
        System.out.println("Enter patient's pesel: ");
        String pesel = input.next();

        if(current_patients < MAX_NUMBER_OF_PATIENTS)
        {
            patients[current_patients] = new Patient(firstName, lastName, pesel);
            current_patients++;
        }
        else
            System.out.println("The limit of patients is 10!");
    }

    public void printPatients() {
        for (int i = 0; i < current_patients; i++) {
            System.out.println(patients[i].getFirstName() + " "
                    + patients[i].getLastName() + " "
                    + patients[i].getPesel());
        }
    }
}
