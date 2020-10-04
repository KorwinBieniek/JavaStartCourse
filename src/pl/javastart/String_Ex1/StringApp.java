package pl.javastart.String_Ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringApp {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numberOfWords = Integer.parseInt(br.readLine());
        String[] strings = new String[numberOfWords];

        for (int i = 0; i < numberOfWords; i++)
            strings[i] = br.readLine();

        System.out.println(StringMethods.wordFromFirstLetters(strings));
    }
}
