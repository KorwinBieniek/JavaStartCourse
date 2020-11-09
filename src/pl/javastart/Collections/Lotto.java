package pl.javastart.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {

    public static List<Integer> nums = new ArrayList<>();

    public static void generate() {
        for (int i = 1; i < 50; i++) {
            nums.add(i);
        }
    }

    public static void randomize() {
        Collections.shuffle(nums);
        nums = nums.subList(0,6);
    }

    public static int checkResult(List<Integer> numbers) {

        int correctNums = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (nums.get(i).equals(numbers.get(i))) {
                correctNums++;
            }
        }
        return correctNums;
    }
}
