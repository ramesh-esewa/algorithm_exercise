package arrays;

import java.util.Arrays;

/**
 * @author Ramesh Khanal
 * 9/30/2023
 */
public class ArraySumIndicesApp {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1};
        int sum = 6;
        System.out.println("The sum indices are: " + Arrays.toString(findSumIndices(arr, sum)));
    }

    public static int[] findSumIndices(int[] nums, int target) {
        int[] indices = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }
        return indices;
    }

    //Hash Map
    //public int[] twoSum(int[] nums, int target) {
    //        int[] indices = new int[2];
    //        Map<Integer, Integer> map = new HashMap();
    //        for(int i = 0; i < nums.length; i++) {
    //            int temp = target - nums[i];
    //            if (map.containsKey(temp)) {
    //                indices[0] = map.get(temp);
    //                indices[1] = i;
    //                break;
    //            }
    //            map.put(nums[i], i);
    //        }
    //        return indices;
    //    }
}
