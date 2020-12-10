package pl.javastart_zadania.sorting_algorithms;

public class SelectionSort {

    public static int[] selectionSort(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            int currentNum = nums[i];
            int minNum = currentNum;
            int minNumIndex = i;

            for (int j = i; j < nums.length; j++) {

                if (minNum > nums[j]) {
                    minNum = nums[j];
                    minNumIndex = j;
                }
            }
            nums[i] = minNum;
            nums[minNumIndex] = currentNum;
        }
        return nums;
    }
}
