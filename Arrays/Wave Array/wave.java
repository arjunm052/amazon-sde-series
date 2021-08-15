import java.util.*;

public class wave {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        wave(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    public static void wave(int[] arr, int n) {
        for (int i = 0; i < n; i += 2) {
            swap(arr, i, Math.min(i + 1, n - 1));
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
