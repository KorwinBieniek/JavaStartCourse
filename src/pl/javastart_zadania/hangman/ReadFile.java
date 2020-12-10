package pl.javastart_zadania.hangman;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ReadFile {
    private static int lines = 0;
    private static final List<String> words = new ArrayList<>();

    public static void wordFromFile() {

        try (
                BufferedReader reader = new BufferedReader(new FileReader("words.txt"))
        ) {
            String nextLine;
            while ((nextLine = reader.readLine()) != null) {
                words.add(nextLine);
                lines++;
            }
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku");
        }
    }

    public static String randomWord() {
        Random rand = new Random();
        int word = rand.nextInt(words.size());
        return words.get(word);
    }

}
