import java.util.*;

public class secmax {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        System.out.println(largestAndSecondLargest(n, arr));
    }

    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[]) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < sizeOfArray; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
            if (arr[i] < first && arr[i] > second) {
                second = arr[i];
            }
        }
        res.add(first);
        if (second == Integer.MIN_VALUE) {
            res.add(-1);
        } else {
            res.add(second);
        }

        return res;
    }
}
