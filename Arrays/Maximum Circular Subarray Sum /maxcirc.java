import java.util.*;

public class maxcirc {
    public static void main(String[] args) {
        int arr[] = { 8, -8, 9, -9, 10, -11, 12 };
        System.out.println(maxCircSum(arr));
    }

    public static int maxCircSum(int[] arr) {
        int maxNormal = maxSubarraySum(arr);
        if (maxNormal < 0) {
            return maxNormal;
        }

        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
            arr[i] = -arr[i];
        }
        int maxCircular = arrSum + maxSubarraySum(arr);

        return Math.max(maxNormal, maxCircular);
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
