package pl.javastart.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import java.util.*;

public class Company {

    private static Map<String, Employee> map = new HashMap<>();
    private static Scanner input = new Scanner(System.in);

    public static void addEmployee() {
        System.out.println("Input first name: ");
        String firstName = input.next();
        System.out.println("Input last name: ");
        String lastName = input.next();
        System.out.println("Input salary: ");
        int salary = input.nextInt();

        Employee employee = new Employee(firstName, lastName, salary);

        map.put(firstName + " " + lastName, employee);
    }

    public static void findEmployee(String key) {
        for (Map.Entry<String, Employee> s : map.entrySet()) {
            if (s.getKey().equals(key)) {
                System.out.println(s.getValue());
            } else {
                System.out.println("There is no such record");
            }
        }
    }

    public static void print() {
        System.out.println(map);
    }
}
