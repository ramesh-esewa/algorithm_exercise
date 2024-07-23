package arrays;

import java.util.HashMap;

/**
 * @author Ramesh Khanal
 * 10/3/2023
 */

public class GoodPairsInArrayApp {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println("Good pairs count: " + numIdenticalPairs(nums));
        System.out.println("Good pairs count: " + numIdenticalPairsV2(nums));
    }

    private static int numIdenticalPairsV2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num: nums) {
            if (map.containsKey(num)) {
                count += map.get(num);
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        return count;
    }

    private static int numIdenticalPairs(int[] nums) {
        int count = 0;
        int len = nums.length;
        for (int i = 0 ; i < len-1; i++) {
            for(int j=i+1; j< len; j++) {
                if(nums[i]==nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
