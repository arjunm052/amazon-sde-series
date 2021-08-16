import java.util.*;

public class floor {
    public static void main(String[] args) {

    }

    public static int floorSol(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        int res = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                res = arr[mid];
                break;
            }
            if (arr[mid] < x && arr[mid] > res) {
                res = arr[mid];
            }
            if (arr[mid] > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return res;
    }
}
