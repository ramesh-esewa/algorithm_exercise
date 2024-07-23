package arrays;

/**
 * @author Ramesh Khanal
 * 10/4/2023
 */

public class SearchInsertPositionApp {
    public static void main(String[] args) {
        int[] nums = {1, 3};
        int target = 3;
        System.out.println("The insert position is: " + searchInsert(nums, target));
        System.out.println("The insert position is: " + searchInsertV2(nums, target));
    }

    private static int searchInsertV2(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private static int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int idx = 0;
        if (nums[0] == target || nums[0] > target) {
            idx = 0;
        } else if (nums[len - 1] == target) {
            idx = len - 1;
        } else if (nums[len - 1] < target) {
            idx = len;
        }

        for (int i = 0; i < len - 1; i++) {
            if (nums[i] == target) {
                idx = i;
            } else if (nums[i] < target && target < nums[i + 1]) {
                idx = i + 1;
            }
        }
        return idx;
    }
}
