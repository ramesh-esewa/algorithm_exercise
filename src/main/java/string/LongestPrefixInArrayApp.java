package string;

import java.util.Arrays;

/**
 * @author Ramesh Khanal
 * 10/3/2023
 */

//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".

public class LongestPrefixInArrayApp {
    public static void main(String[] args) {
        String[] strings = {"flower","flow","flown"};
        System.out.println("The longest common prefix is: " + longestCommonPrefix(strings) );
    }

    private static String longestCommonPrefix(String[] strs) {
        //sort the array
        Arrays.sort(strs);
        //Get first and last strings
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()) {
            //compares front characters
            if(s1.charAt(idx) == s2.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
}
