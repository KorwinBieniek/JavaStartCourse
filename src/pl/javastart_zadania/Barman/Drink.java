package pl.javastart_zadania.Barman;

public class Drink {

    private final Ingredient ing1;
    private final Ingredient ing2;
    private final Ingredient ing3;

    public Ingredient getIng1() {
        return ing1;
    }

    public Ingredient getIng2() {
        return ing2;
    }

    public Ingredient getIng3() {
        return ing3;
    }

    public Drink(Ingredient ing1, Ingredient ing2, Ingredient ing3) {
        this.ing1 = ing1;
        this.ing2 = ing2;
        this.ing3 = ing3;
    }
}
