package pl.javastart_zadania.BarmanV2.Barman;

import java.util.List;

public class Drink {

    private final List<Ingredient> ingredients;

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public Drink(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
