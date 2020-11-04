package pl.javastart.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int sum = 0;

        String choice = "";

        while (!choice.equals("exit")) {
            try {

                choice = scanner.next();
                list.add(Integer.parseInt(choice));


            } catch (NumberFormatException e) {
                System.out.println("Please enter a number to add it to the list\nEnter 'exit' to exit the program");
            } catch (NullPointerException e) {
                System.out.println("The number cannot be null");
            }
        }
        for (Integer integer : list) {
            sum += integer;
            System.out.println(integer);
        }

        System.out.println("Suma: " + sum);

    }
}
