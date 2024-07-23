package numbers;

/**
 * @author Ramesh Khanal
 * 9/29/2023
 */
public class EvenIntegersSumApp {
    public static void main(String[] args) {
        int sum = 16;
        int count = 3;
        checkPossibleSum(sum, count);
    }

    private static void checkPossibleSum(int sum, int count) {
        if (sum % 2 != 0) {
            System.out.println("No");
        }
        //sum of first n(count) even integers
        int temp = count * (count + 1);
        if (temp <= sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    //Time Complexity: O(1)
    //Auxiliary Space: O(1)
}
