import java.util.*;

public class remdup {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 3, 3, 7, 5 };
        int n = arr.length;
        System.out.println(removeDuplicate(arr, n));
    }

    public static ArrayList<Integer> removeDuplicate(int arr[], int n) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int x : arr) {
            set.add(x);
        }
        ArrayList<Integer> res = new ArrayList<>(set);
        return res;
    }
}
