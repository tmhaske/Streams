package org.tm.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCommaSeperated {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "kiwi", "grape", "pineapple", "mango", "orange", "fig", "watermelone", "pear", "blueberry", "plum", "strawberry", "date");
        System.out.println("Orignal Data :: " + list);
        String result = list.stream()
                .collect(Collectors.joining(" ,"));
        System.out.println("Result :: " + result);
    }
}
