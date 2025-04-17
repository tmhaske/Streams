package org.tm.basic;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class FindMinAndMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,34,4,33,21,5,6,78,77,552,12);
        System.out.println("Orginal List :: " + list);
        OptionalInt result = list.stream()
                .mapToInt(Integer::intValue)
                .max();

        System.out.println("Max :: " + result.getAsInt());
        OptionalInt result1 = list.stream()
                .mapToInt(Integer::intValue)
                .min();
        System.out.println("Min :: "+result1.getAsInt());


    }
}