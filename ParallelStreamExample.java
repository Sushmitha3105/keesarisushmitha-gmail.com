package com.meghana;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args) {
        // Create a list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using sequential stream
        long sequentialSumOfSquares = numbers.stream()
                .mapToLong(num -> num * num)
                .sum();
        System.out.println("Sequential sum of squares: " + sequentialSumOfSquares);

        // Using parallel stream
        long parallelSumOfSquares = numbers.parallelStream()  // Use parallelStream instead of stream
                .mapToLong(num -> num * num)
                .sum();
        System.out.println("Parallel sum of squares: " + parallelSumOfSquares);
    }
}
