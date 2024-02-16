package com;

import java.util.Arrays;

public class _RemoveElement {
    // 1 2 8 6 4
    public static int removeElement(int[] nums, int val) {
        int end = nums.length;
        for (int i = 0; i < end; ) {
            if (nums[i] == val) {
                nums[i] = nums[--end];
            } else {
                i++;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        var nums = new int[]{1, 2, 8, 6, 4};
        System.out.println(removeElement(nums, 2));
        System.out.println(Arrays.toString(nums));
    }
}
