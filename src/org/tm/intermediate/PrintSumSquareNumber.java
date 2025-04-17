package org.tm.intermediate;

import java.util.Arrays;
import java.util.List;

public class PrintSumSquareNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 10, 40, 50, 20, 60, 70, 30, 80, 90, 100, 40);
        System.out.println("Orignal List :: "+numbers);
        int result = numbers.stream()
                .mapToInt(num -> num *num)
                .sum();
        System.out.println("Result :: "+result); 
    }
}
