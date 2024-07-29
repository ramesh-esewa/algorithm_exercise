package geekschallenge;

/**
 * @author Ramesh Khanal
 * 7/29/2024
 */

/**
 * Find a peak element which is not smaller than its neighbours.
 */
public class PeakElement {
    static int findPeak(int[] arr) {
        int len = arr.length;
        if (len == 1 || arr[0] >= arr[1]) {
            return arr[0];
        }

        if (arr[len-1] >= arr[len-2]) {
            return arr[len-1];
        }

        for (int i = 1; i < len-1; i++) {
            if (arr[i] >= arr[i-1] && arr[i] >= arr[i+1]) {
                return arr[i];
            }
        }
        return arr[0];
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 15, 5};
        System.out.println("The peak element is " + findPeak(arr));
    }

}
