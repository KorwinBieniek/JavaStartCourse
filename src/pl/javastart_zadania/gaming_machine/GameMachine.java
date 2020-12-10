package pl.javastart_zadania.gaming_machine;

import java.util.List;

public class GameMachine {

    List<Game> games = List.of(new Game("Witcher 3", 80),
            new Game("Heroes 3", 50));

    public void buy(String name, int cash) throws NotEnoughMoneyException, NonExistentGameException {

        String gameTitle = "";

        for (Game game : games) {
            if (game.getName().equals(name)) {
                if (game.getPrice() < cash) {
                    System.out.println("The spare: " + (cash - game.getPrice()));
                } else if (game.getPrice() > cash) {
                    throw new NotEnoughMoneyException(game.getPrice());
                }
                System.out.println("Get the game " + game.getName());
                return;
            }
        }
        throw new NonExistentGameException(name);
    }
}
