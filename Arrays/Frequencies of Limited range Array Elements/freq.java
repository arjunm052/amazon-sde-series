import java.util.*;

public class freq {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 2, 3, 5 };
        frequencyCount(arr);
    }

    public static void frequencyCount(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int i = 1; i <= arr.length; i++) {
            System.out.print(map.getOrDefault(i, 0) + " ");
        }
    }
}
