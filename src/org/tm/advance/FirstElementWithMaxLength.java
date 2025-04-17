package org.tm.advance;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstElementWithMaxLength {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "watermelon", "banana", "strawberry", "grape", "pineapple", "kiwi", "cantaloupe", "pear", "blueberry");


        System.out.println("Orignal Data :: " + strings);
        Optional<String> result = strings.stream()
                .filter(str -> str.length() == 10)
                .findFirst();
        System.out.println("Result :: " + result.get());
    }
}
