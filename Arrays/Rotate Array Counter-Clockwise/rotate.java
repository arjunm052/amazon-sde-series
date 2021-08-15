import java.util.*;

public class rotate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        rotate(arr, arr.length, 2);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] arr, int n, int d) {
        if (d == n) {
            return;
        }
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i++, j--);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
