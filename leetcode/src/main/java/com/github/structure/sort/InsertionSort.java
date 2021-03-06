package com.github.structure.sort;

import com.github.utils.PrintUtils;
import com.github.utils.SortTestHelper;

/**
 * @author hangs.zhang
 * @date 2020/05/27 21:42
 * *****************
 * function: 在近乎有序的情况下, 性能很好
 */
public class InsertionSort {

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int e = arr[i];
            int j;
            for (j = i; j > 0 && arr[j - 1] > e; j--) {
                // 元素后移
                arr[j] = arr[j - 1];
            }
            arr[j] = e;
        }
    }

    public static void insertionSort(int[] arr, int left, int right) {
        for (int i = left + 1; i < right; i++) {
            int e = arr[i];
            int j;
            for (j = i; j > 0 && arr[j - 1] > e; j--) {
                // 元素后移
                arr[j] = arr[j - 1];
            }
            arr[j] = e;
        }
    }

    public static void main(String[] args) {
        int[] arr = SortTestHelper.generateRandomArray(1000, -100, 1000);
        sort(arr);
        PrintUtils.print(arr);
    }

}
