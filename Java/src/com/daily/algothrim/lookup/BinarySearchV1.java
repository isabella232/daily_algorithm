package com.daily.algothrim.lookup;

/**
 * 二分查找第一个等于给定的值
 */
public class BinarySearchV1 {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 4, 5, 6, 9, 29, 93, 93, 93, 95, 213, 741};
        System.out.println(new BinarySearchV1().search(a, a.length, 93));
    }

    /**
     * O(log n)
     */
    private int search(int[] a, int n, int value) {
        int start = 0;
        int end = n - 1;
        while (end >= start) {
            int mid = start + ((end - start) >> 1);
            if (a[mid] < value) {
                start = mid + 1;
            } else if (a[mid] > value) {
                end = mid - 1;
            } else {
                if (mid == 0 || a[mid - 1] != value) return mid;
                end = mid - 1;
            }
        }

        return -1;
    }
}
