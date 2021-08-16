import java.util.*;

public class subar {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 7, 5 };
        int sum = 12;
        System.out.println(subarraySum(arr, sum));

    }

    public static ArrayList<Integer> subarraySum(int[] arr, int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        int start = 0, currSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            while (currSum > sum && start < i - 1) {
                currSum -= arr[start++];
            }

            if (currSum == sum) {
                res.add(start);
                res.add(i - 1);
                break;
            }

            if (i < arr.length) {
                currSum += arr[i];
            }
        }

        return res;
    }
}
