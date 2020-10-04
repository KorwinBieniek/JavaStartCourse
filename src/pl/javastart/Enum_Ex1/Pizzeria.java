package pl.javastart.Enum_Ex1;

import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {

        System.out.println("Dostepne pizze");
        for(Pizza s : Pizza.values())
            System.out.println(s.getName());

        System.out.println("Wybierz pizze:");
        Scanner input = new Scanner(System.in);

        String pizzaName = input.next();
        Pizza pizza = Pizza.fromDescription(pizzaName);

        System.out.println("You chose " + pizza.getName() + ".\n" + pizza);
    }
}
