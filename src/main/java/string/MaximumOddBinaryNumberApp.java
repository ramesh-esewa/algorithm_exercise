package string;

/**
 * @author Ramesh Khanal
 * 10/2/2023
 */

//You are given a binary string s that contains at least one '1'.
//You have to rearrange the bits in such a way that the resulting binary number is the maximum odd binary number
// that can be created from this combination.
//Return a string representing the maximum odd binary number that can be created from the given combination.
//Note that the resulting string can have leading zeros.

public class MaximumOddBinaryNumberApp {
    public static void main(String[] args) {
        String s = "010101";
        System.out.println("Maximum odd binary number is: " + maximumOddBinaryNumber(s));
    }
    private static String maximumOddBinaryNumber(String s) {
        int oneCount = -1;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                oneCount++;
            }
        }
        for (int i=0; i< s.length(); i++, oneCount--) {
            result.append(oneCount > 0 ? '1' : '0');
        }
        result.setCharAt(result.length() - 1, '1');
        return result.toString();
    }
}
