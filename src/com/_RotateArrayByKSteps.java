package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _RotateArrayByKSteps {
    // 1 2 8 6 4
    public static void rotate(int[] nums, int k) {

    int cIV = nums[0], cI = 0, newIV;
        for (int i = 0; i < nums.length -1; i++) {
            int newI = newIndex(cI, k, nums.length -1);
            newIV = nums[newI];
            nums[newI] = cIV;
            cI = newI;
            cIV = newIV;
            System.out.println(Arrays.toString(nums));
        }
        nums[0] = cIV;
    }

    private static int newIndex(int cI, int increment, int maxI) {
        return cI + increment > maxI ?
                cI + increment - maxI -1 :
                cI + increment;
    }



    public static void main(String[] args) {
        var nums = new int[]{1,2,3,4,5,6,7};
        rotate(nums, 2);
//        System.out.println();
        System.out.println(Arrays.toString(nums));
    }
}
