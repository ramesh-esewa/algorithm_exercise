package string;

/**
 * @author Ramesh Khanal
 * 10/2/2023
 */

//You are given two strings s1 and s2, both of length 4, consisting of lowercase English letters.
//You can apply the following operation on any of the two strings any number of times:
//Choose any two indices i and j such that j - i = 2, then swap the two characters at those indices in the string.
//Return true if you can make the strings s1 and s2 equal, and false otherwise.

public class SwapCharEqualApp {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";
        System.out.println("Can be equal after swap: " + canBeEqual(s1, s2));
    }

    private static boolean canBeEqual(String s1, String s2) {
        char[] ch = new char[4];
        for (int i = 0; i < 4; i++) {
            ch[i] = s2.charAt(i);
        }

        for (int i=0; i<4; i++) {
            if (ch[i] == s1.charAt(i)){
                continue;
            } else if (i+2 <4 && ch[i+2] == s1.charAt(i)) {
                //swap characters
                char c = ch[i+2];
                ch[i+2] = ch[i];
                ch[i] = c;
            } else {
                return false;
            }
        }
        return true;
    }
}
