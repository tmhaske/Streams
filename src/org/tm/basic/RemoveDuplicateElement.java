package org.tm.basic;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "grape","apple", "watermelon", "kiwi", "berry", "orange","kiwi","berry");
        System.out.println("Orginal List :: " + list);

        // Approch 1
        List<String> result = list.stream()
                .distinct()
                .toList();
        System.out.println("Result :: " + result);

        //Approch 2
        Set<String> distictData=  list.stream().collect(Collectors.toSet());
        System.out.println("Result :: "+ distictData);
    }
}