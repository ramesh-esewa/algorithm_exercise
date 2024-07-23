package string;

/**
 * @author Ramesh Khanal
 * 10/3/2023
 */
public class StartOfSubStringApp {
    public static void main(String[] args) {
        String s1 = "mississippi";
        String s2 = "issip";
        System.out.println("The starting index of substring: " + strStr(s1, s2));
        System.out.println("The starting index of substring: " + strStrV2(s1, s2));
    }

    private static int strStrV2(String haystack, String needle) {
        int haylength=haystack.length();
        int needlelength=needle.length();
        if(haylength<needlelength)
            return -1;
        for(int i=0;i<=haylength-needlelength;i++){
            int j=0;
            while(j<needlelength && haystack.charAt(i+j)==needle.charAt(j))
                j++;
            if(j==needlelength){
                return i;
            }
        }
        return -1;
    }

    private static int strStr(String haystack, String needle) {
        int len1 = needle.length();
        int len2 = haystack.length();

        int idx = 0;
        for (int i=0; i < len2; i++) {
            if (haystack.charAt(i) == needle.charAt(idx)) {
                idx++;
            } else  {
                i = i -idx;
                idx = 0;
            }
            if (idx == len1) {
                return (i- len1) + 1;
            }
        }
        return -1;
    }
}
