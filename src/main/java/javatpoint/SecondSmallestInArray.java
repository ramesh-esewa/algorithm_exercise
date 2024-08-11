package javatpoint;

/**
 * @author Ramesh Khanal
 * 8/11/2024
 */
public class SecondSmallestInArray {

    static int secondSmallest(int[] arr) {
        int temp;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {  //sort array in ascending order
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[1];
    }

    public static void main(String[] args) {
        System.out.println("Second smallest element :  " + secondSmallest(new int[] {1,6,5,2,3,2}));
    }
}
