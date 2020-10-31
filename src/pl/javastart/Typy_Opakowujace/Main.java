package pl.javastart.Typy_Opakowujace;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("c:/liczby.txt"));
        int[] nums = new int[3];
        BigInteger[] bigInts = new BigInteger[2];

        for (int i = 0; i < 3; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < 2; i++) {
            bigInts[i] = new BigInteger(reader.readLine());
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println(sum);

        System.out.println("Sum of BigInteger is: " + bigInts[0].add(bigInts[1]));
    }
}
