package arrays;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author Ramesh Khanal
 * 9/29/2023
 */

public class ArrayPairProductApp {
    public static void main(String[] args) {
        int[] arr = {10, 20, 9, 40};
        int product = 400;
        if (checkPairExistForProduct(arr, product)) {
            System.out.println("Pair found");
        } else {
            System.out.println("Pair not found");
        }
    }

    //nested traversing
//    private static boolean checkPairExistForProduct(int[] arr, int product) {
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if(arr[i]*arr[j] == product) {
//                    System.out.println("Pair consists of: " + arr[i] + " " + arr[j]);
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    //two pointer technique
//    private static boolean checkPairExistForProduct(int[] arr, int product) {
//        Arrays.sort(arr);
//        int left = 0;
//        int right = arr.length - 1;
//        while (left < right) {
//            int temp = arr[left] * arr[right];
//            if(temp == product) {
//                System.out.println("Pair consists of: " + arr[left] + " " + arr[right]);
//                return true;
//            } else if (temp < product) {
//                left++;
//            } else {
//                right--;
//            }
//        }
//        return false;
//    }

    //Hashing technique
    private static boolean checkPairExistForProduct(int[] arr, int product) {
        HashSet<Integer> set = new HashSet<>();
        set.add(arr[0]);
        for (int i = 1; i< arr.length; i++) {
            int temp = product/arr[i];
            if (set.contains(temp)) {
                System.out.println("Pair consists of: " + temp + " " + arr[i]);
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}
