package pl.javastart.Streams;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream.iterate(0, x -> x + 1)
                .filter(x -> x >100)
                .filter(x -> x < 1000)
                .filter(x -> x % 5 == 0)
                .limit(10)
                .map(x -> x * 3)
                .forEach(System.out::println);
    }
}
