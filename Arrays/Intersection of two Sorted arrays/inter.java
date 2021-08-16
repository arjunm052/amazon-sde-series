import java.util.*;

public class inter {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6 };
        int arr2[] = { 3, 4, 5, 6, 7 };
        System.out.println(intersection(arr1, arr2));
    }

    public static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                res.add(arr2[i]);
                set.remove(arr2[i]);
            }
        }

        return res;
    }
}
