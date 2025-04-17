package org.tm.advance;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartationWithVovel {

    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "apple", "apricot", "banana", "blueberry", "cherry",
                "cranberry", "date", "dragonfruit", "elderberry",
                "fg", "grape", "guava", "honeydew", "kiwi", "lemon",
                "lime", "mango", "nectarine", "orange", "papaya",
                "peach", "pear", "plum", "raspberry", "strawberry",
                "tangerine", "watermelon"
        );
        System.out.println("Orignal Data :: " + words);
        Map<Boolean, List<String>> result = words.stream()
                .collect(Collectors.partitioningBy(str -> str.matches(".*[aeiou].*")));
        System.out.println("Result :: " + result.get(false));
        System.out.println("Result :: " + result.get(true));
    }
}
