package arrays;

import java.util.HashSet;

/**
 * @author Ramesh Khanal
 * 9/28/2023
 */

public class MultipleArrayApp {

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 7, 5, 4 };
        int[] arr2 = { 0, 7, 4, 3, 2, 1 };
        int sum = 8;
        findPairsByHashing(arr1, arr2, sum);
    }

    private static void findPairsByHashing(int[] arr1, int[] arr2, int sum) {
        HashSet<Integer> set = new HashSet<>();
        int len1 = arr1.length;
        int len2 = arr2.length;
        for (int i = 0; i < len1; i++)
            set.add(arr1[i]);
        for (int j = 0; j < len2; j++) {
            int temp = sum - arr2[j];
            if (set.contains(temp)) {
                System.out.println("Sum pair found as: " + temp + " " + arr2[j]);
            }
        }
    }
    //Time Complexity: O(n)
    //Auxiliary Space: O(n)

// Nested traverse
//    private static void findPairsByNestedTraversing(int[] arr1, int[] arr2, int sum) {
//        int len1 = arr1.length;
//        int len2 = arr2.length;
//        for (int i = 0; i < len1; i++) {
//            for (int j = 0; j < len2; j++){
//               if (arr1[i] + arr2[j] == sum) {
//                   System.out.println("Sum pair found as: " + arr1[i] + " " + arr2[j]);
//               }
//            }
//        }
//        System.out.println("Sum pair not found");
//    }
    //Time Complexity : O(n^2)
    //Auxiliary Space : O(1)
}
