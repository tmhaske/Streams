package org.tm.advance;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ReverseStringList {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "watermelon", "banana", "strawberry", "grape", "pineapple", "kiwi", "cantaloupe", "pear", "blueberry");

        System.out.println("Orignal Data :: " + strings);
        List<String> result = strings.stream()
                .sorted(Comparator.comparing(String::valueOf).reversed())
                .toList();
        System.out.println("Result :: " + result);
    }
}
