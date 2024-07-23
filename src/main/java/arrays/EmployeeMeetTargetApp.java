package arrays;

/**
 * @author Ramesh Khanal
 * 10/2/2023
 */
public class EmployeeMeetTargetApp {
    public static void main(String[] args) {
        int[] i = {1, 2, 5, 3, 0};
        int target = 3;
        System.out.println("Employees meeting the target: " + numberOfEmployeesWhoMetTarget(i, target));

    }

    private static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int e : hours) {
            if(e >= target) {
                count++;
            }
        }
        return count;
    }
}
