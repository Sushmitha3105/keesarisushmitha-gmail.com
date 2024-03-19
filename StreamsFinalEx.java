package com.meghana;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsFinalEx {
    public static void main(String[] args) {
        List<Integer> num1= Arrays.asList(2,1,4,7,10);
        Stream<Integer> num2 = num1.stream().
                filter((Integer val)->val>=3).
                peek((Integer val)-> System.out.println(val)).
                map((Integer val )->val*-1).
                peek((Integer val)-> System.out.println(val)).
                sorted().
                peek((Integer val)-> System.out.println(val));

        List<Integer> num3 = num2.collect(Collectors.toList());
        System.out.println(num3);

        final Collection< String > strings = new ArrayList<>();
// Some implementation here
        final int sumOfLengths = strings.parallelStream()
                .filter( str -> !str.isEmpty() )
                .mapToInt( str -> str.length() )
                .sum();


    }
}
