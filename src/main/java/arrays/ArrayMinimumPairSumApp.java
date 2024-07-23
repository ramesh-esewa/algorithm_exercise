package arrays;

import java.util.Arrays;

/**
 * @author Ramesh Khanal
 * 9/29/2023
 */
public class ArrayMinimumPairSumApp {
    public static void main(String[] args) {
        int[] arr = {9, 6, 5, 1};
        findOptimalPairs(arr);
    }

    private static void findOptimalPairs(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        for (int i = 0, j = len - 1; i <= j; i++, j--) {
            System.out.println("Optimal pairs are: " + "(" + arr[i] + "," + arr[j] + ")");
        }
    }
}
