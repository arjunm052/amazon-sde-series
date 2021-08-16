/*
Given an array A[] of N positive integers. 
The task is to find the maximum of j - i subjected to the 
constraint of A[i] <= A[j].
*/

import java.util.*;

public class maxin {
    public static void main(String[] args) {
        int arr[] = { 34, 8, 10, 3, 2, 80, 30, 33, 1 };
        System.out.println(maxIndex(arr));
    }

    public static int maxIndex(int[] arr) {
        int res = Integer.MIN_VALUE;
        int n = arr.length;
        int[] leftMin = new int[n];
        int[] rightMax = new int[n];

        leftMin[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(arr[i], leftMin[i - 1]);
        }

        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }

        int i = 0, j = 0;
        while (i < n && j < n) {
            if (leftMin[i] <= rightMax[j]) {
                res = Math.max(res, j - i);
                j++;
            } else {
                i++;
            }
        }

        return res;
    }
}