package pl.javastart_zadania.array_methods;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayService {

    public static void menu() {
        Scanner input = new Scanner(System.in);
        String choice;

        ArrayMethods am = new ArrayMethods();

        int[][] arr1 = {{8,8,8,1,6,3},{2,4,5},{7,8,9},{6,4,2}};
        int[][] arr2 = {{4,3,2},{1,1,1},{8,9,9},{3,6,7}};

        String[] str1 = {"Psy","Koty","Krowy"};
        String[] str2 = {"Swinie","Kurczaki","Tygrysy"};

        int[] tab = {1,2,3,4,5,6,7,11,5,23,626,2,2352,31,-6,-42,5321,-12+3};

        do{
            System.out.println("Input \"Get Bigger\" to return sum of a bigger two-dimensional array\n" +
                            "Input \"Get Longer\" to return array with the bigger sum of chars in words\n" +
            "Input \"Get Max\" to return max value from an array\n" +
            "Input \"Get Min\" to return min value from an array\n" +
            "Input \"Get Max Row\" to return the row from two dimensional array with the biggest sum\n" +
                    "Input \"Exit\" to exit the program");
            choice = input.nextLine().toLowerCase();

            switch(choice) {
                case "get bigger" -> System.out.println(Arrays.deepToString(am.getBigger(arr1, arr2)));
                case "get longer" -> System.out.println(Arrays.toString(am.getLonger(str1, str2)));
                case "get max" -> System.out.println(am.returnMax(tab));
                case "get min" -> System.out.println(am.returnMin(tab));
                case "get max row" -> System.out.println((Arrays.toString(am.getMaxRow(arr1))));
                case "exit" -> System.out.println("Goodbye");
                default -> System.out.println("There is no such option");
            }
        }while(!choice.equals("exit"));
    }
}
