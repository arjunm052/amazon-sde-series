import java.util.*;

public class dup {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 2, 3 };
        int n = arr.length;
        System.out.println(duplicates(arr, n));
    }

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> mp : map.entrySet()) {
            if (mp.getValue() > 1) {
                res.add(mp.getKey());
            }
        }

        if (res.size() == 0) {
            res.add(-1);
            return res;
        }

        Collections.sort(res);
        return res;
    }
}
