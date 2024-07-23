package string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ramesh Khanal
 * 10/4/2023
 */
public class LastWordLengthApp {
    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";
        System.out.println("The length of last word: " + lengthOfLastWord(str));
    }

    private static int lengthOfLastWord(String s) {
        s = s.trim();
        List<String> strs = Arrays.stream(s.split(" ")).map(String :: trim).collect(Collectors.toList());
        String lastword = strs.get(strs.size()-1);
        return lastword.length();

    }
}
