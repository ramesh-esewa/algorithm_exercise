package arrays;

/**
 * @author Ramesh Khanal
 * 10/1/2023
 */
public class SubArrayGreaterThanArraySumApp {
    public static void main(String[] args) {
        int[] arr = {-1, 7, 4, 2};
        int size = arr.length;
        if (checkPossibleSubArray(arr, size)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean checkPossibleSubArray(int[] arr, int size) {
        int sum = 0;
        //forward traversing
        for (int i = 0; i<size; i++) {
            sum += arr[i];
            if (sum <= 0) {
                return true;
            }
        }
        sum = 0;
        //backward traversing
        for (int i = size - 1; i >= 0; i--) {
            sum += arr[i];
            if (sum <=0) {
                return true;
            }
        }
        return false;
    }
}
