package org.tm.advance;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelImplWithArray {

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Orignal Data :: " + numbers);
        int result = Arrays.stream(numbers)
                .parallel().map(data -> data*data)
                .sum();

        System.out.println("Result :: "+result);
    }
}
