package numbers;

/**
 * @author Ramesh Khanal
 * 9/29/2023
 */
public class FirstEvenIntegersSumApp {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum of first " + n + " even integer is: " + getEvenSum(n));
    }

    private static int getEvenSum(int n) {
        //formula
        return n * (n + 1);
        //Time Complexity: O(1)
        //Space Complexity: O(1) since using constant variables

//        int sum = 0, cur = 2;
//        for (int i = 1; i <= n; i++) {
//            sum += cur;
//            cur += 2;
//        }
//        return sum;
    }
    //Time Complexity: O(n)
    //Auxiliary Space: O(1)
}
