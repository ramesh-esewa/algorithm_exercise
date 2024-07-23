package matrix;

import java.util.HashSet;

/**
 * @author Ramesh Khanal
 * 9/29/2023
 */

public class MatrixPairProductApp {
    static final int N = 4;
    static final int M = 4;

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int product = 42;
        if (checkPairWithProduct(mat, product)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    //Hashing technique
    private static boolean checkPairWithProduct(int[][] mat, int product) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int temp = product / mat[i][j];
                if (product % mat[i][j] == 0 && set.contains(temp)) {
                    System.out.println("Matrix element pair: " + temp + " " + mat[i][j]);
                    return true;
                }
                set.add(mat[i][j]);
            }
        }
        return false;
    }
    //Time Complexity: O(N*M)
    //Auxiliary Space: O(N*M)
}
