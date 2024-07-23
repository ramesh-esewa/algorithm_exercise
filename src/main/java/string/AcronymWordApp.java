package string;

import java.util.Arrays;
import java.util.List;

/**
 * @author Ramesh Khanal
 * 10/2/2023
 */

//Given an array of strings words and a string s, determine if s is an acronym of words.
//The string s is considered an acronym of words if it can be formed
// by concatenating the first character of each string in words in order.
// For example, "ab" can be formed from ["apple", "banana"], but it can't be formed from ["bear", "aardvark"].
//Return true if s is an acronym of words, and false otherwise.

public class AcronymWordApp {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "ball", "call");
        String s = "ab";
        System.out.println("Is acronym word: " + isAcronym(words, s));
    }

    private static boolean isAcronym(List<String> words, String s) {
        StringBuilder s2 = new StringBuilder();
        for (String word : words) {
            s2.append(word.charAt(0));
        }
        return s2.toString().equals(s);
    }
}
