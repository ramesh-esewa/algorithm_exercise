package string;

/**
 * @author Ramesh Khanal
 * 10/2/2023
 */
public class ColorPiecesSelectionApp {
    public static void main(String[] args) {
        String str = "AAAABBBB";
        if(winnerOfGame(str)) {
            System.out.println("Alice won!");
        } else {
            System.out.println("Bob won!");
        }
    }

    private static boolean winnerOfGame(String colors) {
        int aliceCount = 0;
        int bobCount = 0;
        boolean alice = true;
        boolean bob = false;
        char[] str = colors.toCharArray();
        StringBuilder builder = new StringBuilder(colors);
        for (int i = 1; i < builder.length() - 1; i++) {
            if (builder.charAt(i-1) == 'A' && builder.charAt(i) == 'A' && builder.charAt(i+1) == 'A') {
                aliceCount++;
                builder.deleteCharAt(i);
            }

            if (builder.charAt(i-1) == 'B' && builder.charAt(i) == 'B' && builder.charAt(i+1) == 'B') {
                bobCount++;
                builder.deleteCharAt(i);
            }
        }
        return aliceCount > bobCount;
    }
}
