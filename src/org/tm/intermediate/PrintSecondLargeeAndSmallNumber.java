package org.tm.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class PrintSecondLargeeAndSmallNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 10, 40, 50, 20, 60, 70, 30, 80, 90, 100, 40);
        System.out.println("Orignal List :: "+numbers);
        Optional<Integer> result = numbers.stream()
                .distinct()
                .sorted(Comparator.comparingInt(Integer::intValue).reversed())
                        .skip(1)
                        .findFirst();
        System.out.println("Second Large Number :: "+result.get());

        Optional<Integer> result1 = numbers.stream()
                .distinct()
                .sorted(Comparator.comparingInt(Integer::intValue))
                .skip(1)
                .findFirst();
        System.out.println("Second Small Number :: "+result1.get());
    }
}
