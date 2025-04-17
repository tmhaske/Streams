package org.tm.advance;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapByFirstLetter {

    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "apple", "apricot", "banana", "blueberry", "cherry",
                "cranberry", "date", "dragonfruit", "elderberry",
                "fig", "grape", "guava", "honeydew", "kiwi", "lemon",
                "lime", "mango", "nectarine", "orange", "papaya",
                "peach", "pear", "plum", "raspberry", "strawberry",
                "tangerine", "watermelon"
        );
        System.out.println("Orignal Data :: " + words);
        Map<Character,List<String>> result = words.stream()
                .collect(Collectors.groupingBy(str -> str.charAt(0)));
        System.out.println("Result :: " + result);
    }
}
