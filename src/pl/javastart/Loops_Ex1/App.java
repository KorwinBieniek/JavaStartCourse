package pl.javastart.Loops_Ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How many numbers would you like to enter? ");
        int numbers = Integer.parseInt(br.readLine());
        int sum = 0;

        while(numbers-- > 0)
        {
            sum += Integer.parseInt(br.readLine());
        }

        System.out.println(sum);
        br.close();
    }
}
