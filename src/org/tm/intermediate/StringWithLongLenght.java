package org.tm.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StringWithLongLenght {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "kiwi", "grape", "pineapple", "mango", "orange", "fig", "watermelone", "pear", "blueberry", "plum", "strawberry", "date");

        System.out.println("Orignal Data :: " + list);
        Optional<String> result = list.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println("Result :: " + result.get());
    }
}
