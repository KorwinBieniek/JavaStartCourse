package pl.javastart_zadania.gaming_machine;

public class Game {

    private final String name;
    private final int price;

    public Game(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
