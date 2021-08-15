import java.util.*;

public class prod {
    public static void main(String[] args) {
        int arr[] = { 10, 3, 5, 6, 2 };
        System.out.println(Arrays.toString(prodArray(arr, arr.length)));
    }

    public static int[] prodArray(int[] arr, int n) {
        int[] res = new int[n];
        res[0] = arr[0];
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * arr[i];
        }

        int prod = 1;
        for (int i = n - 1; i > 0; i--) {
            res[i] = res[i - 1] * prod;
            prod = prod * arr[i];
        }

        res[0] = prod;

        return res;
    }
}
