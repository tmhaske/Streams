package org.tm.intermediate;

import java.util.Arrays;
import java.util.List;

public class PrintSquareNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 10, 40, 50, 20, 60, 70, 30, 80, 90, 100, 40);
        System.out.println("Orignal List :: "+numbers);
        List<Integer> result = numbers.stream()
                .map(num -> num *num)
                .toList();
        System.out.println("Result :: "+result); 
    }
}
