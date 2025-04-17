package org.tm.advance;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PartitionDataOddEven {

    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(0,50).boxed().toList();

        System.out.println("Orignal Data :: " + numbers);
        Map<Boolean, List<Integer>> result = numbers.stream()
                .collect(Collectors.partitioningBy(data -> (data & 1)==0));
        System.out.println("Result :: "+result.get(false));
        System.out.println("Result :: "+result.get(true));

    }
}
