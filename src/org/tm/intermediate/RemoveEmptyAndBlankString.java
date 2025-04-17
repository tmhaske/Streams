package org.tm.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RemoveEmptyAndBlankString {

    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "apple",
                "",
                "banana",
                null,
                "grape",
                "   ",
                "",
                "orange",
                null,
                "kiwi"
        );
        System.out.println("Orignal Data :: " + list);
        List<String> result = list.stream()
                .filter(Objects::nonNull)
                .filter(str -> !(str.isBlank() || str.isEmpty()))
                .toList();
        System.out.println("Result :: " + result);
    }
}
