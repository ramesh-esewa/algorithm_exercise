package string;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Ramesh Khanal
 * 10/2/2023
 */
public class PalindromeStringApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        if (isPalindromeString(input)) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
        scanner.close();
    }

    private static boolean isPalindromeString(String input) {
        input = input.replace("\\s+", "").toLowerCase();
        int l = 0;
        int r = input.length() - 1;
        while (l < r) {
            if (input.charAt(l) != input.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }


}
