package geekschallenge;

import java.util.Arrays;

/**
 * @author Ramesh Khanal
 * 7/29/2024
 *
 * find the minimum (or maximum) element of an array.
 */
public class FindMinMaxValue {
    static int[] findMinMaxValue(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int[] minmax = new int[2];
        minmax[0] = min;
        minmax[1] = max;
        return minmax;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 15, 5};
        System.out.println("The min and max values are: " + Arrays.toString(findMinMaxValue(arr)));
    }
}
