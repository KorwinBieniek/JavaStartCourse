package pl.javastart.KonstrukcjaSuper_Ex1;

public class GroceryShop {
    public static void main(String[] args) {
        Apple apple = new Apple(15, "Szampion");
        Fruit fruit = new Fruit(44, "Arbuz");

        System.out.println(apple.toString());
        System.out.println(fruit.toString());
    }
}
