package pl.javastart_zadania.BarmanV2.Barman;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("Likier kokosowy",30));
        ingredients.add(new Ingredient("Mleko",60));
        ingredients.add(new Ingredient("Sok ananasowy",45));
        ingredients.add(new Ingredient("Wódka",20));
        ingredients.add(new Ingredient("Tonik",80));


        Barman.printDrink(Barman.createDrink(ingredients));
    }
}
