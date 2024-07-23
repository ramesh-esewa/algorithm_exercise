package arrays;

/**
 * @author Ramesh Khanal
 * 9/30/2023
 */
public class MonotonicArrayApp {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        if (isMonotonic(nums)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isMonotonic(int[] nums) {
        boolean incCount = false;
        boolean decCount = false;
        if (nums.length <= 1) {
            return true;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                incCount = true;
            } else if (nums[i] > nums[i + 1]) {
                decCount = true;
            }
        }
        return !decCount || !incCount;
    }
}
