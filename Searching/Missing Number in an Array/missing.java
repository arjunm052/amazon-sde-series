/*
Given an array of size N-1 such that it only contains distinct integers 
in the range of 1 to N. Find the missing element.
*/

import java.util.*;

public class missing {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
        System.out.println(findMissingOpt(arr));
    }

    public static int findMissing(int[] arr) {
        Arrays.sort(arr);
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                res = i + 1;
                break;
            }
        }
        return res;
    }

    public static int findMissingOpt(int[] arr) {
        int x1 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            x1 = x1 ^ arr[i];
        }
        int x2 = 1;
        for (int i = 2; i <= arr.length + 1; i++) {
            x2 = x2 ^ i;
        }

        return x1 ^ x2;
    }
}
