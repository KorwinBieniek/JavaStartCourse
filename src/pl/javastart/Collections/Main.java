package pl.javastart.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> userNums = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            userNums.add(input.nextInt());
        }

        Lotto.generate();
        Lotto.randomize();
        System.out.println("You've guessed " + Lotto.checkResult(userNums) + " numbers correctly.");
        System.out.println("User numbers " + userNums);
        for (int i = 0; i < 6; i++) {
            System.out.println(Lotto.nums.get(i));
        }
    }
}
