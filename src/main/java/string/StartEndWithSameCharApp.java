package string;

/**
 * @author Ramesh Khanal
 * 10/1/2023
 */
public class StartEndWithSameCharApp {
    // assuming lower case only
    static final int MAX_CHAR = 26;

    public static void main(String[] args) {
        // Given string
        String str = "GeeksforGeeks";

        // Function call
        System.out.println("Total substrings: " + countSubStrings(str));
        System.out.println("Total substrings: " + countSubStringsV2(str));
        System.out.println("Total strings after rotation: " + countStringsAfterRotation(str));
    }

    private static int countSubStringsV2(String str) {
        int result = 0;
        int n = str.length();

        // Calculating frequency of each character
        // in the string.
        int[] count =  new int[MAX_CHAR];
        for (int i = 0; i < n; i++)
            count[str.charAt(i)-'a']++;

        // Computing result using counts
        for (int i = 0; i < MAX_CHAR; i++)
            result += (count[i] * (count[i] + 1) / 2);

        return result;
    }

    private static int countStringsAfterRotation(String str) {
        int count = 0;
        for (int i=0; i< str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                count++;
            }
        }
        return count;
    }

    private static int countSubStrings(String str) {
        int count = 0;
        int len = str.length();
        for (int i = 0; i < len-1; i++) {
            for (int j=i+1; j<len; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }
}
