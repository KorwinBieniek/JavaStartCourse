package pl.javastart.CollectionsProcessing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> words;

        try {


            words = readFile("loremipsum.txt");
            words.forEach(x -> System.out.print(x + " "));
            showStats(words);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void showStats(List<String> words) {
        long countWords = words.stream()
                .filter(s -> s.startsWith("s"))
                .count();

        long fiveLetters = words.stream()
                .filter(s -> s.length() == 5)
                .count();

        System.out.println("\nWords that start with s: " + countWords);
        System.out.println("Words that have exactly 5 letters: " + fiveLetters);
    }

    private static List<String> readFile(String fileName) throws IOException {
        try (var reader = new BufferedReader(new FileReader(fileName))) {
            return reader.lines() //Stream<String>
                    .map(line -> line.split(" ")) //Stream<String[]>
                    .flatMap(Arrays::stream) //Stream<String>
                    .map(s -> s.replaceAll(",", "").replaceAll("\\.", "")) //Stream<String>
                    .collect(Collectors.toList());
        }
    }

}
