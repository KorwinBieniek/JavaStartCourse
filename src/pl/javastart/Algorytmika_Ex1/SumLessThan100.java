package pl.javastart.Algorytmika_Ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumLessThan100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number");
        int choice = Integer.parseInt(br.readLine());
        int sum = choice;

        while(choice <= 100)
        {
            System.out.println("Enter a number");
            choice = Integer.parseInt(br.readLine());
            sum += choice;
        }

        if(sum % 2 == 0)
            System.out.println(sum + " is even");
        else
            System.out.println(sum + " odd");
    }
}
