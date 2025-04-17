package org.tm.advance;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SumMultiDim {

    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9),
                Arrays.asList(10)
        );

        System.out.println("Orignal Data :: " + listOfLists);
        int result = listOfLists.stream()
                .flatMap(data -> data.stream())
                .mapToInt(Integer::valueOf)
                .sum();
        System.out.println("Result :: " + result);

        int[][] array2D = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9},
                {10}
        };

        int result1 = Arrays.stream(array2D)
                .flatMapToInt(Arrays::stream)
                .sum();
        System.out.println("Result :: " + result1);


    }
}
