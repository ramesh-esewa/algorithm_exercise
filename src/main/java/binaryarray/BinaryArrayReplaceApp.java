package binaryarray;

import java.net.Socket;
import java.util.ArrayList;

/**
 * @author Ramesh Khanal
 * 9/30/2023
 */
public class BinaryArrayReplaceApp {
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1};
        System.out.println("Last number: " + findLastNumber(arr));
    }

    private static int findLastNumber(int[] arr) {
        int ones = 0;
        for (int i : arr) {
            if(i == 1) {
                ones++;
            }
        }
        if (ones % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    //Time Complexity: O(N)
    //Auxiliary Space: O(1)
}
