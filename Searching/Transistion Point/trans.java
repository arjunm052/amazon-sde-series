//Given a sorted array containing only 0s and 1s, 
//find the transition point. 

import java.util.*;

public class trans {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 0 };
        System.out.println(transistionPoint(arr));
    }

    public static int transistionPoint(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == 0) {
                start = mid + 1;
            } else if (arr[mid] == 1) {
                if (mid == 0 || (mid > 0 && arr[mid - 1] == 0)) {
                    return mid;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

}
