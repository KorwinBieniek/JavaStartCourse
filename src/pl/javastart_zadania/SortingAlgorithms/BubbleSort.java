package pl.javastart_zadania.SortingAlgorithms;

public class BubbleSort {

    public static int[] bubbleSort(int[] nums) {
        boolean changed = false;

        for (int i = 0; i < nums.length - 1; i++) {
            int currentNum = nums[i];
            int nextNum = nums[i + 1];

            if (currentNum > nextNum) {
                nums[i] = nextNum;
                nums[i + 1] = currentNum;
                changed = true;
            }
        }
        return changed ? bubbleSort(nums) : nums;
    }
}
