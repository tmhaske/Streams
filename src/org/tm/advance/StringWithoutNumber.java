package org.tm.advance;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringWithoutNumber {

    public static void main(String[] args) {
        List<String> mixedData = Arrays.asList(
                "apple", "banana", "123", "grape123", "4567",
                "cherry", "89kiwi", "melon", "42", "peach", "lemon99", "watermelon"
        );

        System.out.println("Orignal Data :: " + mixedData);
        List<String> result = mixedData.stream()
                .filter(str -> !str.matches(".*[0-9].*"))
                .toList();
        System.out.println("Result :: " + result );
    }
}
