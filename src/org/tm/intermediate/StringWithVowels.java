package org.tm.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StringWithVowels {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "kiwi", "grape", "pineapple", "mango", "orange", "fig", "watermelone", "pear", "blueberry", "plum", "strawberry", "date");
        System.out.println("Orignal Data :: " + list);
        List<String> result = list.stream()
                .filter(str -> str.matches(".*[aeiou].*"))
                .toList();
        System.out.println("Result :: " + result);
    }
}
