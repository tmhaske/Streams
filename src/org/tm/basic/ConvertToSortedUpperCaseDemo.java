package org.tm.basic;

import java.util.Arrays;
import java.util.List;

public class ConvertToSortedUpperCaseDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "grape", "watermelon", "kiwi", "berry", "orange");
        System.out.println("Orginal List :: " + list);
        List<String> result = list.stream()
                .map(String::toUpperCase)
                .sorted()
                .toList();
        System.out.println("Converted List :: " + result);

    }
}