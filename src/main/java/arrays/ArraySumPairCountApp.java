package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ramesh Khanal
 * 9/29/2023
 */
public class ArraySumPairCountApp {
    public static void main (String[] args) {
        int[] arr = { 1, 5, 7, -1 , 2};
        int sum = 6;
        findPairsByHashing(arr, sum);
        List<Integer> nums = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println("Count pairs less than sum/target: " + countPairs(nums, sum));
    }

    private static void findPairsByHashing(int[] arr, int sum) {
        HashSet<Integer> set = new HashSet<>();
        set.add(arr[0]);
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (set.contains(sum - arr[i])) {
                System.out.println("Sum pair found as: " + (sum - arr[i]) + " " + arr[i]);
                count++;
            }
            set.add(arr[i]);
        }
        System.out.println("Total sum pair count: " + count);
    }

    //Given a 0-indexed integer array nums of length n and an integer target, return the number of pairs (i, j)
    // where 0 <= i < j < n and nums[i] + nums[j] < target.
    private static int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.size()-1; i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    System.out.println("Sum pair found as: " + nums.get(i) + " " + nums.get(j));
                    count++;
                }
            }
        }
        return count;
    }

// Nested Traversing
//    private static void findPairsByNestedTraversing(int[] arr, int sum) {
//        int count = 0;
//        for(int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == sum) {
//                    System.out.println("Sum pair found as: " + arr[i] + " " + arr[j]);
//                    count++;
//                }
//            }
//        }
//        System.out.println("The total count of sum pair: " + count);
//    }
    //Time Complexity: O(n^2), traversing the array for each element
    //Auxiliary Space: O(1)
}
