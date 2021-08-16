import java.util.*;

public class sortbin {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 1, 1, 1, 1, 1, 0, 0, 0 };
        sorrtBinary(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sorrtBinary(int[] arr) {
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                swap(arr, start++, i);
            }
        }

    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
