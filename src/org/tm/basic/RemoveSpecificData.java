package org.tm.basic;

import java.util.Arrays;
import java.util.List;

public class RemoveSpecificData {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "grape", "apple", "watermelon", "kiwi", "berry", "orange", "kiwi", "berry");
        System.out.println("Orginal List :: " + list);

        List<String> result = list.stream()
                .filter(str -> !(str.charAt(0) == 'b'))
                .toList();
        System.out.println("Result :: " + result);

    }
}