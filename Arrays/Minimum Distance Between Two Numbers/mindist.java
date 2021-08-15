import java.util.*;

public class mindist {
    public static void main(String[] args) {

    }

    public static int minDist(int[] arr, int n, int x, int y) {
        int ans = Integer.MAX_VALUE, prev = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x || arr[i] == y) {
                if (prev != -1 && arr[i] != arr[prev]) {
                    ans = Math.min(ans, i - prev);
                }
                prev = i;
            }
        }

        if (ans == Integer.MAX_VALUE) {
            return -1;
        }

        return ans;
    }
}
