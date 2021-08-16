import java.util.*;

public class peak {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println(peakElement(arr));
    }

    public static int peakElement(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
