package com;

import java.util.Arrays;

public class _1MergeSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m, j=0; i < nums1.length && j < nums2.length; i++, j++) {
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
    }

    private void insert(int[] nums1, int atIndex, int num) {
//        Arrays.fill(n);
    }
}
