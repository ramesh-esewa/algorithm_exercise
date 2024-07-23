package numbers;

import java.util.Scanner;

/**
 * @author Ramesh Khanal
 * 10/2/2023
 */
public class PalindromeNumberApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        if(isPalindrome(num)) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
        scanner.close();
    }

    private static boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        }
        int originalNo = num;
        int reversedNo = 0;
        while (num > 0 ) {
            int digit = num % 10;
            reversedNo = reversedNo * 10 + digit;
            num /= 10;
        }
        return originalNo == reversedNo;
    }
}
