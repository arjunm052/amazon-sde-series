import java.util.*;

public class equi {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 2, 2 };
        System.out.println(equilibrium(arr));
    }

    public static int equilibrium(int[] arr) {
        int n = arr.length;
        int total = arr[0];
        int sum[] = new int[n];
        sum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + arr[i];
            total += arr[i];
        }

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                int lSum = 0;
                int rSum = total - sum[i];
                if (lSum == rSum) {
                    return 0;
                }
            } else {
                int lSum = sum[i - 1];
                int rSum = total - sum[i];
                if (lSum == rSum) {
                    return i;
                }
            }
        }

        return -1;
    }

}
