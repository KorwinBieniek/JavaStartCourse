package pl.javastart_zadania.SortingAlgorithms;

public class InsertionSort {

    public static int[] insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int number = nums[i];
            int currentIndex = i - 1;

            while (currentIndex >= 0 && nums[currentIndex] > number) {
                nums[currentIndex + 1] = nums[currentIndex];
                currentIndex--;
            }
            nums[currentIndex + 1] = number;
        }
        return nums;
    }
}
