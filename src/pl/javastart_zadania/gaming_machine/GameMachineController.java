package pl.javastart_zadania.gaming_machine;

import java.util.Scanner;

public class GameMachineController {

    private static final GameMachine gm = new GameMachine();

    public static void chooseGame() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter game title:");
        String gameTitle = input.nextLine();
        System.out.println("Input money:");
        //input.next();
        int cash = input.nextInt();

        try {
            gm.buy(gameTitle, cash);
        } catch(NonExistentGameException | NotEnoughMoneyException e) {
            e.printStackTrace();
        }
    }
}
