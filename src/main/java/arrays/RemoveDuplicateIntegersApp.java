package arrays;

import java.util.Arrays;

/**
 * @author Ramesh Khanal
 * 10/3/2023
 */

/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that
 * each unique element appears only once. The relative order of the elements should be kept the same.
 * Then return the number of unique elements in nums.
 *
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 *
 * Change the array nums such that the first k elements of nums contain the unique elements in the order they were present
 * in nums initially. The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 */
public class RemoveDuplicateIntegersApp {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("Total unique integers: " + removeDuplicates(arr));
        System.out.println("Array with unique integers: " + Arrays.toString(arr));
    }

    private static int removeDuplicates(int[] arr) {
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]) {
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}
