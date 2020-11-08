package pl.javastart_zadania.BarmanV2.Barman;

import java.util.List;

public class Barman {

    public static Drink createDrink(List<Ingredient> ingredients) {
        return new Drink(ingredients);
    }

    public static void printDrink(Drink drink) {
        int totalAmount = 0;
                List<Ingredient> list = drink.getIngredients();
                System.out.print("Składniki drinka to ");

        for (Ingredient ingredient : list) {
            System.out.print(ingredient.getIngName() + ", ");
            totalAmount += ingredient.getIngAmount();
        }
        System.out.print("w proporcjach ");
        for (Ingredient ingredient : list) {
            System.out.print(ingredient.getIngAmount() + ", ");
        }

        System.out.print(" jego pojemność to " + totalAmount + "ml");

    }
}
