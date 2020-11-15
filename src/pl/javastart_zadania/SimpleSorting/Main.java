package pl.javastart_zadania.SimpleSorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player[] players = {
                new Player("Julia", 50),
                new Player("Korwin",100),
                new Player("Konrad",64),
                new Player("arzegorz",64),
                new Player("Adam",53),
                new Player("Jurek",13),
                new Player("Norbert",64),
                new Player("zafal",73),
                new Player("Marek",88),
                new Player("Ania",101),
                new Player("Pyzuch",75)};

        //Arrays.sort(players, (p1, p2) -> Integer.compare(p1.getPoints(), p2.getPoints()));
        //Arrays.sort(players, Comparator.comparing(Player::getName));
        Arrays.sort(players, Comparator.comparing(Player::getName).reversed());

        for (Player player : players) {
            System.out.println(player);
        }
    }
}
