package geekschallenge;

import java.util.Arrays;

/**
 * @author Ramesh Khanal
 * 7/29/2024
 */
public class ReverseArray {

    static int[] reverseArray(int[] arr) {
        int[] reversedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - 1 -i];
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 15, 5};
        System.out.println("Reversed array is " + Arrays.toString(reverseArray(arr)));
    }
}
