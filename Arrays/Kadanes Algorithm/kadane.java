import java.util.*;

public class kadane {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -2, 5 };
        System.out.println(maxSubarraySum(arr));
    }

    public static int maxSubarraySum(int[] arr) {
        int currSum = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currSum = Math.max(currSum + arr[i], arr[i]);
            maxSoFar = Math.max(currSum, maxSoFar);
        }

        return maxSoFar;
    }
}
