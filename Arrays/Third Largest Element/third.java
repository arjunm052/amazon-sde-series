import java.util.*;

public class third {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 5 };
        System.out.println(thirdLargest(arr));
    }

    public static int thirdLargest(int[] arr) {
        if (arr.length <= 2) {
            return -1;
        }

        int first = 0, second = 0, third = 0;
        first = second = third = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] < first && arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] < first && arr[i] < second && arr[i] > third) {
                third = arr[i];
            }
        }

        return third;
    }
}
