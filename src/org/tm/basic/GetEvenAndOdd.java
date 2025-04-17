package org.tm.basic;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GetEvenAndOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,34,4,33,21,5,6,78,77,552,12);
        System.out.println("Orginal List :: " + list);
        Map<Boolean, List<Integer>> result = list.stream()
                .collect(Collectors.partitioningBy(i -> i%2==0));

        System.out.println("Even Data :: " + result.get(true));
        System.out.println("ODD Data :: " + result.get(false));


    }
}