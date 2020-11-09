package pl.javastart.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        //Supplier<Integer> supplier = () -> random.nextInt(100)+1;

        List<Integer> list;
        list = generateRandomNumbers(10, () -> random.nextInt(100)+1);

        consumeList(list, x -> System.out.print(x + " "));

        removeEvenNumbers(list, x -> x%2 == 0);

        System.out.println();
        consumeList(list, x -> System.out.print(x + " ") );
    }


    public static <T> List<T> generateRandomNumbers(int elements, Supplier<T> supplier) {
        List<T> list = new ArrayList<>();

        for (int i = 0; i < elements; i++) {
            list.add(supplier.get());
        }

        return list;
    }

    public static <T> void consumeList(List<T> list, Consumer<T> consumer)
    {
        for (T t : list) {
            consumer.accept(t);
        }
    }

    public static <T> void removeEvenNumbers(List<T> list, Predicate<T> predicate) {
        list.removeIf(predicate);
    }

}