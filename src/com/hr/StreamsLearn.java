package com.hr;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsLearn {

     public static void main(String[] args) {
         Stream.of(1,2,3,4,5,6,7,8,9,10)
                 .filter(i -> i % 2 == 0)
                 .map(i -> i * i)
                 .collect(Collectors.toCollection(() -> new java.util.ArrayList<>()));
     }

}
