package geekschallenge;

import java.util.Arrays;

/**
 * @author Ramesh Khanal
 * 8/6/2024
 */
public class RotateArrayByOne {

    static int[] rotateArray(int[] arr) {
        int len = arr.length;
        int last_item = arr[len-1];
        for (int i = len -1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = last_item;
        return arr;
     }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Array after rotation: " + Arrays.toString(rotateArray(arr)));
    }
}
