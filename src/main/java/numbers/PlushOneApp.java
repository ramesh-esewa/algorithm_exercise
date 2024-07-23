package numbers;

import java.util.Arrays;

/**
 * @author Ramesh Khanal
 * 10/4/2023
 */
public class PlushOneApp {
    public static void main(String[] args) {
        int[] num = {1, 8, 9};
        //System.out.println("Get plus one array: " + Arrays.toString(plusOne(num)));
        System.out.println("Get plus one array: " + Arrays.toString(plusOneV2(num)));
    }

    private static int[] plusOneV2(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    private static int[] plusOne(int[] digits) {
        int num = 0;
        int multiplier = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            num += digits[i] * multiplier;
            multiplier = multiplier * 10;
        }
        num += 1;
        String str = String.valueOf(num);
        int len = str.length();
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = str.charAt(i) - '0';
        }
        return res;
    }
}
