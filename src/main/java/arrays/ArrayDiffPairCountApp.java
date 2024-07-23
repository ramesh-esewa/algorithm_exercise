package arrays;

/**
 * @author Ramesh Khanal
 * 9/29/2023
 */
public class ArrayDiffPairCountApp {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 2};
        int diff = 3;
        //findDiffPairByNestedTraversing(arr, diff);
        findDiffPairByHashing(arr, diff);
    }

    private static void findDiffPairByHashing(int[] arr, int diff) {
    }
//Nested Traversing
//    private static void findDiffPairByNestedTraversing(int[] arr, int diff) {
//        int count = 0;
//        int len = arr.length;
//        for (int i = 0; i < len - 1; i++) {
//            for (int j = i + 1; j < len; j++) {
//                if (arr[i] - arr[j] == diff || arr[j] - arr[i] == diff) {
//                    System.out.println("The diff pair found as: " + arr[i] + " " + arr[j]);
//                    count++;
//                }
//            }
//        }
//        System.out.println("The total diff pair count: " + count);
//    }
    //Time Complexity: O(n2)
    //Auxiliary Space: O(1), since no extra space has been taken.
}
