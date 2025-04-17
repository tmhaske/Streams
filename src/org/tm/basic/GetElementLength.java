package org.tm.basic;

import java.util.Arrays;
import java.util.List;

public class GetElementLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "grape", "watermelon", "kiwi", "berry", "orange");
        System.out.println("Orginal List :: " + list);
        List<Integer> result = list.stream()
                .map(String::length)
                .toList();
        System.out.println("Result :: " + result);

    }
}