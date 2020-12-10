package pl.javastart_zadania.Barman;

public class Main {
    public static void main(String[] args) {
        Barman.printDrink(Barman.createDrink(
                new Ingredient("Sok ananasowy",100),
                new Ingredient("Likier Malibu",50),
        new Ingredient("Mleko kokosowe",100)));
    }
}
