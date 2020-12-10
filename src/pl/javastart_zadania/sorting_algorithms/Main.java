package pl.javastart_zadania.sorting_algorithms;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {7, 18, 15, 5, 3, 11, 16, 8, 20, 14, 9, 2, 17, 12, 4, 1, 6, 10, 19, 13};

        //System.out.println(Arrays.toString(BubbleSort.bubbleSort(numbers)));
        //System.out.println(Arrays.toString(InsertionSort.insertionSort(numbers)));
        System.out.println(Arrays.toString(SelectionSort.selectionSort(numbers)));
    }
}
