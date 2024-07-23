package matrix;

import java.util.HashSet;

/**
 * @author Ramesh Khanal
 * 9/29/2023
 */
public class MatrixPairDiffApp {
    static final int N = 4;
    static final int M = 4;

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 100}};
        int diff = 85;
        if (checkPairWithDiff(mat, diff)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean checkPairWithDiff(int[][] mat, int diff) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                int temp;
                if (mat[i][j] > diff) {
                    temp = mat[i][j] - diff;
                } else {
                    temp = diff - mat[i][j];
                }
                if(set.contains(temp)){
                    System.out.println("The pair: " + temp + " " + mat[i][j]);
                    return true;
                }
                set.add(mat[i][j]);
            }
        }
        return false;
    }
}
