package org.tm.basic;

import java.util.Arrays;
import java.util.List;

public class GetElementLengthAndCount {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "grape", "watermelon", "kiwi", "berry", "orange");
        System.out.println("Orginal List :: " + list);
        long result = list.stream()
                .filter(str -> str.length() > 5)
                .count();
        System.out.println("Result :: " + result);

    }
}