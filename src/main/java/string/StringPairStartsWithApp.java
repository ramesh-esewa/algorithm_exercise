package string;

import java.util.HashSet;

/**
 * @author Ramesh Khanal
 * 10/1/2023
 */
public class StringPairStartsWithApp {
    public static void main(String[] args) {
        String[] arr = {"a", "!a", "b", "! c", "d", "! d"};
        char K = '!';
        int N = arr.length;

        System.out.print(checkCharStartsWith(arr, K, N) +"\n");
    }

    private static String checkCharStartsWith(String[] arr, char k, int n) {
        HashSet<String> set = new HashSet<>();
        for (String e : arr) {
            if (e.charAt(0) == k && set.contains(e.substring(1))) {
                return "Yes";
            } else if (set.contains(k + e)) {
                return "Yes";
            }
            set.add(e);
        }
        return "No";
    }
    //Time Complexity: O(N)
    //Auxiliary Space: O(1)
}
