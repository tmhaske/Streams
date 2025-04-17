package org.tm.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortDataAscDesc {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "kiwi", "grape", "pineapple", "mango", "orange", "fig", "watermelon", "pear", "blueberry", "plum", "strawberry", "date");

        System.out.println("Orignal Data :: "+ list);
        List<String>  result = list.stream().sorted().toList();
        System.out.println("Result Asc :: "+ result);
        List<String>  result1 = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Result Desc :: "+ result1);

    }
}
