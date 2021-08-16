import java.util.*;

public class trap {
    public static void main(String[] args) {
        int arr[] = { 3, 0, 0, 2, 0, 4 };
        System.out.println(optTrap(arr));
    }

    // o(n) TIME and O(n) space
    public static int trap(int[] arr) {
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(arr[i], left[i - 1]);
        }

        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(arr[i], right[i + 1]);
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += Math.min(left[i], right[i]) - arr[i];
        }

        return res;
    }

    // O(n) time and O(1) space
    public static int optTrap(int[] height) {
        int res = 0;
        int n = height.length;
        int left = 0, right = n - 1;
        int maxLeft = 0, maxRight = 0;

        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    res += maxLeft - height[left];
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    res += maxRight - height[right];
                }
                right--;
            }
        }

        return res;
    }

}
