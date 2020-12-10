package pl.javastart_zadania.Argumenty_Wywolania_Programu;

import java.util.ArrayList;
import java.util.List;

public class NumberArgs {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("No arguments were passed");
        }
        else{
            printArgs(args);
            System.out.println();
            List<Integer> list = convertArgsToIntList(args);
            printNums(list);
            System.out.println();
            printSquares(list);
            System.out.println();
            printSum(list);
        }
    }

    public static void printArgs(String[] args) {
        for (String arg : args) {
            System.out.printf("%s ", arg);
        }
    }

    public static List<Integer> convertArgsToIntList(String[] args){
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i < args.length; i++) {

            list.add(Integer.valueOf(args[i]));
        }

        return list;
    }

    public static void printNums(List<Integer> list)
    {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }

    public static void printSquares(List<Integer> list)
    {
        for (Integer integer : list) {
            System.out.printf("%.2f ", Math.sqrt((double) integer));
        }
    }

    public static void printSum(List<Integer> list)
    {
        int sum = 0;

        for (Integer integer : list) {
            sum += integer;
        }

        System.out.println(sum);
    }
}
