package pl.javastart_zadania.hangman;

import java.util.Scanner;

public class HangmanService {


    public static void menu() {
        Scanner input = new Scanner(System.in);
        Hangman hangman = new Hangman();
        System.out.println("Welcome to Hangman Game. Please choose an option:\n1. Play\n0. Exit");

        int choice;

        do {
            choice = input.nextInt();

            switch (choice) {
                case 1 -> {
                    boolean check = hangman.play();
                    if (check) {
                        menu();
                    }
                }
                case 0 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("There is no such option. Please choose another");
            }

        } while (true);
    }
}
