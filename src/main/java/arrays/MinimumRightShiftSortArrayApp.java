package arrays;

import java.util.Arrays;

/**
 * @author Ramesh Khanal
 * 10/2/2023
 */
public class MinimumRightShiftSortArrayApp {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 1, 2, 3};
        int result = minRightShiftsToSort(nums);
        if (result != -1) {
            System.out.println("Minimum right shifts required to sort: " + result);
        } else {
            System.out.println("It's not possible to sort the array with right shifts.");
        }
    }

    private static int minRightShiftsToSort(int[] nums) {
        int len = nums.length;
        int[] copy = Arrays.copyOf(nums, len);
        Arrays.sort(copy);

        int startIndex = 0;
        while (startIndex < len && nums[startIndex] != copy[0]) {
            startIndex++;
        }
        for (int i = 0; i < len;i++) {
            int idx = (startIndex + i) % len;
            if (nums[idx] != copy[i]) {
                return -1;
            }
        }
        return startIndex;
    }
}
