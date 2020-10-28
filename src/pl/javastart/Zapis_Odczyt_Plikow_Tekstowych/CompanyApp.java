package pl.javastart.Zapis_Odczyt_Plikow_Tekstowych;

import java.io.*;
import java.util.Scanner;

public class CompanyApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fileName = "company.obj";

        Employee carl = new Employee("Carl", "Johnson", 5000);
        Employee john = new Employee("John", "Carlson", 3500);
        Employee reeve = new Employee("Reeve", "Keany", 2800);

        Company company = new Company(new Employee[]{carl, john, reeve});
        Company company2 = new Company();

        System.out.println("1 to write into file, 2 to read from file");
        int choice = scan.nextInt();

        switch (choice) {
            case 1 -> {
                try (
                        var os = new ObjectOutputStream(new FileOutputStream(fileName))
                ) {
                    os.writeObject(company);
                    System.out.println("The object was saved to " + fileName);
                } catch (IOException e) {
                    System.err.println("File error " + fileName);
                    e.printStackTrace();
                }
            }
            case 2 -> {
                try (
                        var is = new ObjectInputStream(new FileInputStream(fileName))
                ) {
                    company2 = (Company) is.readObject();
                    System.out.println("The object was read from " + fileName);
                } catch (IOException | ClassNotFoundException e) {
                    System.err.println("File error " + fileName);
                    e.printStackTrace();
                }

                if(company2 != null){
                    System.out.println("Data loaded about");
                    for (int i = 0; i < 3; i++) {
                        System.out.println( company2.getEmployees()[i].getFirstName() + " "
                                + company2.getEmployees()[i].getLastName() + " "
                                + company2.getEmployees()[i].getSalary());
                    }
            }
        }
    }
}
}
