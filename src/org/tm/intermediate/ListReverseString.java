package org.tm.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListReverseString {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "kiwi", "grape", "pineapple", "mango", "orange", "fig", "watermelone", "pear", "blueberry", "plum", "strawberry", "date");
        System.out.println("Orignal Data :: " + list);
        List<String> result = list.stream()
                .map(str -> String.valueOf(new StringBuffer(str).reverse()))
                        .toList();
        System.out.println("Result :: " + result);
    }
}
