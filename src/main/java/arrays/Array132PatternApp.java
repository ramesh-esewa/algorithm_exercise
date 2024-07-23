package arrays;

/**
 * @author Ramesh Khanal
 * 9/30/2023
 */
public class Array132PatternApp {
    public static void main(String[] args) {
        int[] arr = {3,1,4,2};
        if(find132pattern(arr)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean find132pattern(int[] nums) {
        int len = nums.length;
        if(len < 3) {
            return false;
        }
        for (int i = 0; i < len - 2; i++) {
            for (int j = i+1; j < len-1; j++) {
                for (int k = j+1; k < len; k++) {
                    if (nums[i] < nums[k]  && nums[k] < nums[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //Stack
    // public boolean find132pattern(int[] arr) {
    //        int n = arr.length;
    //        List<Integer> small = new ArrayList<>();
    //        // min1 is used to keep track of minimum element
    //        // from 0th index to current index
    //        int min1 = arr[0];
    //        for (int i = 0; i < n; i++) {
    //            if (min1 >= arr[i]) {
    //                min1 = arr[i];
    //
    //                // If the element itself is smaller than all
    //                // the elements on left side then we push
    //                // -1.
    //                small.add(-1);
    //            }
    //            else {
    //                // Add that min1;
    //                small.add(min1);
    //            }
    //        }
    //        // Initialize empty stack
    //        Stack<Integer> s = new Stack<>();
    //        // Looping from last index to first index don't
    //        // consider the possibility of 0th index because it
    //        // doesn't have left elements
    //        for (int i = n - 1; i > 0; i--) {
    //            // Pop's up until either stack is empty or top
    //            // element greater than small[i]
    //            while (!s.isEmpty()
    //                   && s.peek() <= small.get(i)) {
    //                s.pop();
    //            }
    //            // Checks the conditions that top element of
    //            // stack is less than arr[i] If true, then
    //            // return true;
    //            if (!s.isEmpty() && small.get(i) != -1
    //                && s.peek() < arr[i]) {
    //                return true;
    //            }
    //            s.push(arr[i]);
    //        }
    //        return false;
    //    }
}
