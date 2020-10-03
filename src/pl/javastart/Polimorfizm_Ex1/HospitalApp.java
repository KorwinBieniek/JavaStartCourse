package pl.javastart.Polimorfizm_Ex1;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Person doctor = new Doctor("Kamil","Nowak",12000, 1000);
        Person nurse1 = new Nurse("Joanna","Nowicka",4000,15);
        Person nurse2 = new Nurse("Anna","Sandra",3600,27);

        Hospital.add(doctor);
        Hospital.add(nurse1);
        Hospital.add(nurse2);

        Hospital.getInfo(Hospital.getList());
    }
}
