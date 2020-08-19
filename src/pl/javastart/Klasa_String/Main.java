package pl.javastart.Klasa_String;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        lastDigit(5);
    }

    public static void lastDigit(int num)
    {
        String[] str = new String[num];
        char[] chars = new char[num];

        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
            chars[i] = str[i].charAt(str[i].length()-1);
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
    }
}
