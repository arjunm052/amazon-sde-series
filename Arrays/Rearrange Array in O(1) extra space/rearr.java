import java.util.*;

public class rearr {
    public static void main(String[] args) {
        int arr[] = { 4, 0, 2, 1, 3 };
        rearrange(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void rearrange(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] + (arr[arr[i]] % n) * n;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / n;
        }
    }
}
