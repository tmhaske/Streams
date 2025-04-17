package org.tm.basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,34,4,33,21,5,6,78,77,552,12);
        System.out.println("Orginal List :: " + list);
        List<Integer> result = list.stream()
                .sorted()
                .toList();

        System.out.println("Sorted Data Asc :: " + result);
        List<Integer> result1 = list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Sorted Data Desc :: " + result1);


    }
}