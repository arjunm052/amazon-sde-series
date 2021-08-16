import java.util.*;

public class root {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(root(n));
    }

    public static int root(int x) {
        if (x == 1) {
            return 1;
        }

        int res = 0;
        int start = 1, end = x;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            int sqr = mid * mid;

            if (sqr == x) {
                res = mid;
                break;
            }

            if (sqr < x) {
                res = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return res;
    }
}
