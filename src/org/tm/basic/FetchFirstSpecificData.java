package org.tm.basic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FetchFirstSpecificData {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "grape", "apple", "watermelon", "kiwi", "berry", "orange", "kiwi", "berry");
        System.out.println("Orginal List :: " + list);

        Optional<String> result = list.stream()
                .filter(str -> str.charAt(0) == 'r')
                .findFirst();
        result.ifPresentOrElse(System.out::println,()-> System.out.println("No Data found"));

        Optional<String> result1 = list.stream()
                .filter(str -> str.charAt(0) == 'k')
                .findFirst();
        result1.ifPresentOrElse(System.out::println,()-> System.out.println("No Data found"));

    }
}