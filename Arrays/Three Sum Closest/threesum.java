import java.util.*;

public class threesum {
    public static void main(String[] args) {
        int arr[] = { -1, 2, 1, -4 };
        int sum = 1;
        System.out.println(closest(arr, sum));
    }

    public static int closest(int[] arr, int s) {
        Arrays.sort(arr);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 2; i++) {
            int start = i + 1;
            int end = arr.length - 1;

            while (start < end) {
                int sum = arr[i] + arr[start] + arr[end];

                if (Math.abs(s - sum) < Math.abs(s - res)) {
                    res = sum;
                }

                if (sum > s) {
                    end--;
                } else {
                    start++;
                }

            }
        }
        return res;
    }
}
