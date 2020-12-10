package pl.javastart_zadania.gaming_machine;

public class NotEnoughMoneyException extends Exception {

    public NotEnoughMoneyException(int cost) {
        super("Not enough money. The game costs " + cost);
    }
}
