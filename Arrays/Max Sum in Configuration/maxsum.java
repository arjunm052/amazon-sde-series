import java.util.*;

public class maxsum {
    public static void main(String[] args) {
        int[] arr = { 8, 3, 1, 2 };
        int n = arr.length;
        System.out.println(maxSum(arr, n));
    }

    public static int maxSum(int[] arr, int n) {
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum += arr[i];
        }
        int currVal = 0;
        for (int i = 0; i < n; i++) {
            currVal += arr[i] * i;
        }

        int res = currVal;

        for (int i = 1; i < n; i++) {
            int nextValue = currVal - (currSum - arr[i - 1]) + arr[i - 1] * (n - 1);
            currVal = nextValue;
            res = Math.max(res, nextValue);
        }

        return res;
    }
}
