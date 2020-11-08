package pl.javastart_zadania.ArrayMethods;

import java.util.Arrays;

public class ArrayMethods {

    public int[][] getBigger(int[][] arr1, int[][] arr2) {
        int sum1 = 0;
        int sum2 = 0;

        for (int[] ints : arr1) {
            for (int anInt : ints) {
                sum1 += anInt;
            }
        }

        for (int[] ints : arr2) {
            for (int anInt : ints) {
                sum2 += anInt;
            }
        }

        System.out.println("The sum for the first array " + sum1 + ", the sum for the second array " + sum2);

        return sum1 >= sum2 ? arr1 : arr2;
    }

    public String[] getLonger(String[] str1, String[] str2) {
        int sum1 = 0;
        int sum2 = 0;

        for (String s : str1) {
            for (int i = 0; i < s.length(); i++) {
                sum1++;
            }
        }

        for (String s : str2) {
            for (int i = 0; i < s.length(); i++) {
                sum2++;
            }
        }

        System.out.println("First string number of chars is: " + sum1 + ", second string number of chars is: " + sum2);

        return sum1 > sum2 ? str1 : str2;
    }

    public int returnMax(int[] tab) {
        int max = tab[0];

        for (int i : tab) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public int returnMin(int[] tab) {
        int min = tab[0];

        for (int i : tab) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public int[] getMaxRow(int[][] arr) {
        int i;
        int rows = 0;

        for (int[] ints : arr) {
            rows++;
        }

        int[] sum = new int[rows];
        int n = 0;


        for (int[] ints : arr) {
            sum[n] = getSumRow(ints);
            n++;
        }
        
        int max = sum[0];

        for (i = 1; i < sum.length; i++) {
            if(sum[i] > max) {
                max = sum[i];
            }
        }
        for (i = 0; i < sum.length; i++) {
            if(max == sum[i])
                break;
        }

        return arr[i];
    }

    public int getSumRow(int[] arr1) {
        int sum = 0;
        for (int i : arr1) {
            sum += i;
        }

        return sum;
    }
}
