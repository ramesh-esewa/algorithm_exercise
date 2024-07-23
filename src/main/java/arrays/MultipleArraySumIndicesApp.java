package arrays;

import java.util.Arrays;
import java.util.Vector;

/**
 * @author Ramesh Khanal
 * 10/1/2023
 */
public class MultipleArraySumIndicesApp {
    public static void main(String[] args) {
        //Method: 1
        int len = 5;
        int[] A = {4, 8, 2, 6, 2};
        int[] B = {4, 5, 4, 1, 3};
        System.out.println("Number of indices pair: " + getIndicesPair(A, B, len));

        //Method: 2
        int n = 5;
        Vector<Integer> A2 = new Vector<Integer>();
        Vector<Integer> B2 = new Vector<Integer>();

        A2.add(4);
        A2.add(8);
        A2.add(2);
        A2.add(6);
        A2.add(2);

        B2.add(4);
        B2.add(5);
        B2.add(4);
        B2.add(1);
        B2.add(3);
        System.out.println("Number of indices pair V2: " + getIndicesPairV2(A2, B2, len));
    }

    private static String getIndicesPairV2(Vector<Integer> A, Vector<Integer> B, int len) {
        //create difference array
        int[] diff = new int[len];
        for (int i = 0; i < len; i++) {
            diff[i] = A.get(i) - B.get(i);
        }
        Arrays.sort(diff);
        int total = 0;
        for (int i = 0; i < len; i++) {
            if (diff[i] <= 0) {
                int k = upper_bound(diff, 0, diff.length, -diff[i]);
                total += len - k;
            } else {
                total += (len - i) * (len - i - 1) / 2;
            }
        }
        return String.valueOf(total);
    }

    private static int upper_bound(int[] diff, int low, int high, int element) {
        while (low < high) {
            int middle = low + (high - low) / 2;
            if (diff[middle] > element) {
                high = middle;
            } else {
                low = middle + 1;
            }
        }
        return low;
    }
    //complexity is O(N * log(N))

    private static String getIndicesPair(int[] A, int[] B, int len) {
        int count = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (A[i] + A[j] > B[i] + B[j]) {
                    System.out.println(A[i] + " + " + A[j] + " is greater than " + B[i] + " + " + B[j]);
                    count++;
                }
            }
        }
        return String.valueOf(count);
    }
    //Time Complexity:- O(N^2)
    //Space Complexity:- O(1)
}
