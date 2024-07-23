package arrays;

import java.util.HashSet;

/**
 * @author Ramesh Khanal
 * 9/30/2023
 */
public class ArrayTripletSumApp {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int sum = 22;
        checkTripletSum(arr, sum);
    }
//nested traversing
//    private static void checkTripletSum(int[] arr, int sum) {
//        int len = arr.length;
//        for (int i = 0; i < len - 2; i++) {
//            for (int j = i + 1; j < len - 1; j++) {
//                for (int k = j + 1; k < len; k++) {
//                    if (arr[i] + arr[j] + arr[k] == sum) {
//                        System.out.println("Sum found with triplet: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
//                        return;
//                    }
//                }
//            }
//        }
//        System.out.println("Sum not found");
//    }
    //Time Complexity: O(n^3), There are three nested loops traversing the array, so the time complexity is O(n^3)
    //Auxiliary Space: O(1), As no extra space is required.

    //Hashing
    private static void checkTripletSum(int[] arr, int sum) {
        int len = arr.length;
        for (int i = 0; i < len-2; i++) {
            HashSet<Integer> set = new HashSet<>();
            int curr_sum = sum - arr[i];
            for (int j = i + 1; j < len; j++) {
                int temp = curr_sum - arr[j];
                if (set.contains(temp)) {
                    System.out.println("Triplets are: " + arr[i] + ", " + temp + ", " + arr[j]);
                    return;
                }
                set.add(arr[j]);
            }
        }
        System.out.println("Triplets not found");
    }
    //Time complexity: O(N^2)
    //Auxiliary Space: O(N), since n extra space has been taken
}
