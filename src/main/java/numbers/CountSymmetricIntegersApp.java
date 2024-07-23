package numbers;

/**
 * @author Ramesh Khanal
 * 10/2/2023
 */

//You are given two positive integers low and high.
//An integer x consisting of 2 * n digits is symmetric
// if the sum of the first n digits of x is equal to the sum of the last n digits of x.
// Numbers with an odd number of digits are never symmetric.
//Return the number of symmetric integers in the range [low, high].

public class CountSymmetricIntegersApp {
    public static void main(String[] args) {
        int low = 1100;
        int high = 1230;
        System.out.println("Symmetric integers: " + countSymmetricIntegers(low, high));

    }

    private static int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int num = low; num <= high; num++) {
            if(isSymmetric(num)) {
                System.out.println(num);
                count++;
            }
        }
        return count;
    }

    private static boolean isSymmetric(int num) {
        String str = String.valueOf(num);
        int len = str.length();
        if(len % 2 != 0) {
            return false; //the character length should be even value
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i< len/2; i++) {
            sum1 += Character.getNumericValue(str.charAt(i));
            sum2 += Character.getNumericValue(str.charAt(len- 1 - i));
        }
        return sum1 == sum2;
    }
}
