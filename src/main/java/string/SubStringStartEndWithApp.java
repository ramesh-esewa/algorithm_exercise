package string;

/**
 * @author Ramesh Khanal
 * 10/1/2023
 */
public class SubStringStartEndWithApp {
    public static void main(String[] args) {
        String str = "abbcaceghcak";
        int n = str.length();
        char x = 'c', y = 'k';

        System.out.print ("Count = " +
                countSubString(str, n, x, y));
    }

    private static int countSubString(String str, int len, char x, char y) {
        int count_x = 0;
        int total_count = 0;
        for (int i = 0; i< len; i++) {
            if (str.charAt(i) == x) {
                count_x++;
            }
            if (str.charAt(i) == y) {
                total_count += count_x;
            }
        }
        return total_count;
    }
}
