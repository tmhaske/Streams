package org.tm.advance;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProductOfAllNumbersWithReduce {

    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1,10).boxed().toList();

        System.out.println("Orignal Data :: " + numbers);
        int result = numbers.stream()
                .reduce(1,(a,b)-> a*b);
        System.out.println("Result :: "+result);
    }
}
