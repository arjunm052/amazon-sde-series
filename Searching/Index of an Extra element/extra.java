import java.util.*;

public class extra {
    public static void main(String[] args) {
        int arr1[] = { 2, 4, 6, 8, 9, 10, 12 };
        int arr2[] = { 2, 4, 6, 8, 10, 12 };
        int n = arr1.length;
        System.out.println(extraElement(arr1, arr2, n));
    }

    public static int extraElement(int a[], int b[], int n) {
        int index = n - 1;
        int start = 0, end = n - 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] == b[mid]) {
                start = mid + 1;
            } else {
                index = mid;
                end = mid - 1;
            }
        }
        return index;
    }
}
