package pl.javastart_zadania.Hangman;

import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

    private final Scanner input = new Scanner(System.in);
    private final static int MAX_MISTAKES = 8;

    public boolean isCorrect(char letter, String word) {

        for (int i = 0; i < word.length(); i++) {
            if (letter == word.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public String inputLetter() {
        boolean flag = false;
        String c = null;

        while (!flag) {
            System.out.println("Input a letter: ");
            c = input.next();
            if (c.length() > 1) {
                System.out.println("Input ONE letter!");
            } else {
                flag = true;
            }
        }
        return c;
    }

    public String createHiddenWord(String word) {
        return "*".repeat(word.length());
    }


    public boolean play() {
        int errors = 0;
        boolean flag = false;

        ReadFile.wordFromFile();
        String word = ReadFile.randomWord().toLowerCase();
        String hiddenWord = createHiddenWord(word);
        boolean isFinished = false;
        int stars;

        while (!isFinished) {
            System.out.print("The word is: " + hiddenWord + " " + word);

            System.out.println();
            char userLetter = inputLetter().charAt(0);

            if (isCorrect(userLetter, word)) {
                char[] newHiddenWord = hiddenWord.toCharArray();
                for (int i = 0; i < newHiddenWord.length; i++) {
                    if (word.charAt(i) == userLetter) {
                        newHiddenWord[i] = userLetter;
                    }
                }
                hiddenWord = "";
                for (char c : newHiddenWord) {
                    hiddenWord += c;
                }
            } else {
                errors++;
                System.out.println("Wrong letter. You have " + (MAX_MISTAKES - errors) + " chances left.");
                if (errors == MAX_MISTAKES) {
                    System.out.println("Sorry, you lost.");
                    return false;
                }
            }
            stars = 0;
            for (int i = 0; i < hiddenWord.length(); i++) {
                if (hiddenWord.charAt(i) == '*') {
                    stars++;
                }
            }
            if (stars == 0) {
                isFinished = true;
                System.out.println("The word is: " + word + "\n\nYou won!\n");
            }
        }
        return true;
    }

}
