package pl.javastart_zadania.GamingMachine;

public class NotEnoughMoneyException extends Exception {

    public NotEnoughMoneyException(int cost) {
        super("Not enough money. The game costs " + cost);
    }
}
