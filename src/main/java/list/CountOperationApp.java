package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ramesh Khanal
 * 10/2/2023
 */

//You are given an array nums of positive integers and an integer k.
//In one operation, you can remove the last element of the array and add it to your collection.
//Return the minimum number of operations needed to collect elements 1, 2, ..., k.

public class CountOperationApp {
    public static void main(String[] args) {
        int[] list = new int[]{3, 1, 5, 4, 2};
        List<Integer> nums = Arrays.stream(list).boxed().collect(Collectors.toList());
        int k = 2;
        System.out.println("Total operations: " + minOperations(nums, k));
    }


    private static int minOperations(List<Integer> nums, int k) {
        int total_op = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = nums.size() - 1; i>=0; i--) {
            total_op++;
            if (nums.get(i) <= k) {
                set.add(nums.get(i));
            }
            if (set.size() == k){
                break;
            }
        }
        return total_op;
    }
}
