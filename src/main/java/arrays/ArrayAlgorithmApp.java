package arrays;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author Ramesh Khanal
 * 9/27/2023
 */
public class ArrayAlgorithmApp {

    public static void main(String[] args) {


        int[] arr = {1, 4, 45, 6, 10, -8};
        int sum = 16;
        int len = arr.length;

        //print even numbers
        printEvenNumbers(arr, len);

        //reverse the array
        reverseArray(arr, 0, len - 1);

        if (checkPairSumByHashing(arr, sum, len)) {
            System.out.print("\nSum found");
        } else {
            System.out.print("\nSum not found");
        }
    }

    //Hashing
    private static boolean checkPairSumByHashing(int[] arr, int sum, int len) {
        HashSet<Integer> set = new HashSet<>();
        set.add(arr[0]);
        for (int i = 1; i < len; i++) {
            int temp = sum - arr[i];
            if (set.contains(temp)) {
                System.out.print("\nSum pair: " + temp + " " + arr[i]);
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
    // Time Complexity: O(N), As the whole array is needed to be traversed only once.
    // Auxiliary Space: O(N), A hash map has been used to store array elements.

    private static void reverseArray(int[] arr, int start, int end) {
        int[] result = arr;
        while (start < end) {
            int temp = result[start];
            result[start] = result[end];
            result[end] = temp;
            start++;
            end--;
        }
        System.out.print("\nReversed array values: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    //Hashing

    //Binary Search
//    private static boolean checkPairSumByBinarySearch(int[] arr, int sum, int len) {
//        Arrays.sort(arr);
//        for (int i = 0; i < len - 1; i++) {
//            int searchKey = sum - arr[i];
//            if (binarySearch(arr, i + 1, len - 1, searchKey)) {
//                return true;
//            }
//        }
//        return false;
//    }


//    private static boolean binarySearch(int[] arr, int low, int high, int searchKey) {
//        while (low <= high) {
//            int j = low + (high - low) / 2;
//            if (arr[j] == searchKey)
//                return true;
//            if (arr[j] < searchKey)
//                low = j + 1;
//            else
//                high = j - 1;
//        }
//        return true;
//    }
// Time Complexity: O(NlogN)
// Auxiliary Space: O(1)

    private static void printEvenNumbers(int[] arr, int len) {
        int oddCount = 0;
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }

        int[] result = new int[oddCount];
        int idx = 0;
        System.out.print("Odd integers ");
        for (int j = 0; j < len - 1; j++) {
            if (arr[j] % 2 != 0) {
                result[idx] = arr[j];
                System.out.print(result[idx] + " ");
                idx++;
            }
        }
    }

//Sorting and two-pointer approach
//    private static boolean checkPairSumBySorting(int[] arr, int sum, int len) {
//        int leftPointer = 0;
//        int rightPointer = len - 1;
//        Arrays.sort(arr);
//
//        while (leftPointer < rightPointer) {
//            if (arr[leftPointer] + arr[rightPointer] == sum) {
//                return true;
//            } else if (arr[leftPointer] + arr[rightPointer] < sum) {
//                leftPointer++;
//            } else {
//                rightPointer--;
//            }
//        }
//        return false;
//    }
// Time Complexity: O(NlogN), Time complexity for sorting the array
// Auxiliary Space: O(1)

    //nested traversal approach
//    private static boolean checkPairSum(int[] arr, int sum, int len) {
//        for(int i = 0; i < len - 1; i++) {
//            for (int j = i + 1; j < len; j++) {
//                if (arr[i] + arr[j] == sum) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
// Time Complexity: O(N^2), Finding pair for every element in the array of size N.
// Auxiliary Space: O(1)
}
