package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _RemoveDuplicatesFromSortedArray2 {
    // 1 2 8 6 4
    public static int removeDuplicates(int[] nums) {
        List<Integer> numsList = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());
        for (int i = 1; i < numsList.size(); ) {
            if (numsList.get(i) == numsList.get(i -1) && i -2 >= 0 && numsList.get(i) == numsList.get(i -2)) {
                numsList.remove(i);
            } else {
                i++;
            }
        }
        for (int i = 0; i < numsList.size(); i++) {
            nums[i] = numsList.get(i);
        }
        return numsList.size();
    }

    public static void main(String[] args) {
        var nums = new int[]{1, 2, 8, 6, 4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
