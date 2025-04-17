package org.tm.basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class CalculateSumAndAvg {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,34,4,33,21,5,6,78,77,552,12);
        System.out.println("Orginal List :: " + list);
        int result = list.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum  :: " + result);
        OptionalDouble result1 = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        result1.ifPresent(System.out::println);


    }
}