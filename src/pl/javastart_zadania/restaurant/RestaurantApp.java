package pl.javastart_zadania.restaurant;

import java.util.List;
import java.util.Scanner;

public class RestaurantApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double sum = 0;

        List<Dish> menu = List.of(new Dish("Pizza Margerita", 1, 24.99),
                new Dish("Pizza Mafioso", 2, 29.99),
                new Dish("Spaghetti Bolognese", 3, 31.99),
                new Dish("Spaghetti Carbonara", 4, 26.99),
                new Dish("Lasagne", 5, 24.99),
                new Dish("Gazpacho", 6, 16.99),
                new Dish("Cannelloni ze szpinakiem", 7, 29.99),
                new Dish("Bruschetta", 8, 13.99),
                new Dish("Tiramisu", 9, 19.99),
                new Dish("Panna Cotta", 10, 19.99));




        System.out.println("Witaj w naszej restauracji\n" +
                "Dzisiejsze Menu:");
        for (Dish dish : menu) {
            System.out.println(dish);
        }

        System.out.println("Zamów wybrane potrawy, wymieniając ich numery po przecinku:");
        String[] orders = input.nextLine().split(",");

        for (String order : orders) {
            sum += Order.addToList(Integer.parseInt(order), menu);
        }


        double tip = PaymentService.calculatePayment(sum);


        System.out.printf("Do zapłaty: %.2f, w tym:\n" +
                "Koszt dań: " + sum +
                "\nKoszt obsługi: " + "%.2f", (sum + tip), tip);

    }
}
