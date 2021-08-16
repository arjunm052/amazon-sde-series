import java.util.*;

public class union {
    public static void main(String[] args) {
        int arr1[] = { 2, 2, 3, 4, 5 };
        int arr2[] = { 1, 1, 2, 3, 4 };
        System.out.println(findUnion(arr1, arr2));
    }

    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        ArrayList<Integer> res = new ArrayList<>(set);
        return res;
    }
}
