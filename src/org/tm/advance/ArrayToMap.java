package org.tm.advance;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayToMap {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Orignal Data :: " + numbers);
        Map<Integer,Integer> result = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toMap(key -> key, val -> val *val));
        System.out.println("Result :: "+result);
    }
}
