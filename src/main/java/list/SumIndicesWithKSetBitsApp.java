package list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ramesh Khanal
 * 10/2/2023
 */

//You are given a 0-indexed integer array nums and an integer k.
//Return an integer that denotes the sum of elements in nums
// whose corresponding indices have exactly k set bits in their binary representation.
//The set bits in an integer are the 1's present when it is written in binary.
//For example, the binary representation of 21 is 10101, which has 3 set bits.

public class SumIndicesWithKSetBitsApp {
    public static void main(String[] args) {
        int[] list = new int[]{3, 1, 5, 4, 2};
        List<Integer> nums = Arrays.stream(list).boxed().collect(Collectors.toList());
        int k = 2;
        System.out.println("Sum of indices with k 1s bits: " + sumIndicesWithKSetBits(nums, k));
    }

    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int result = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (countBits(i) == k) {
                result += nums.get(i);
            }
        }
        return result;
    }

    //count the number of bits(i.e. 1s) in indices
    static int countBits(int n) {
        int count = 0;
        while (n != 0) {
            //this line calculates the least significant bit of n by performing a bitwise AND operation between n and 1.
            // The result will be 1 if the least significant bit of n is set (i.e., it's a 1), and 0 otherwise.
            // It then adds this result to the count variable.
            count += n & 1;
            //This line right-shifts the binary representation of n by one position.
            // This effectively removes the least significant bit that was just processed in the previous step.
            // It continues doing this until all bits of n have been processed.
            n = n >> 1;
        }
        return count;
    }
}
