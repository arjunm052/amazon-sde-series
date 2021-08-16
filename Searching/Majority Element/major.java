import java.util.*;

public class major {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 3, 3, 2 };
        System.out.println(majority(arr));
    }

    public static int majority(int[] arr) {
        int res = 0;
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[res]) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                res = i;
                count = 1;
            }
        }
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[res] == arr[i]) {
                count++;
            }
        }

        if (count <= arr.length / 2) {
            return -1;
        }
        return arr[res];
    }
}
