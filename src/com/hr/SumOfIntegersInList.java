package com.hr;

import java.util.List;
import java.util.stream.Stream;

public class SumOfIntegersInList {
    public static int sum(List<Integer> list) {

        return list.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
