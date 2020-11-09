package pl.javastart.ReferenceToMethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    private static List<String> names = Arrays.asList("Kasia","Robert","Julia","Zdzislaw","Korwin");

    public static void main(String[] args) {
        Collections.sort(names, String::compareToIgnoreCase);

        Consumer<List<String>> consumer = System.out::print;

        consumer.accept(names);
    }
}
