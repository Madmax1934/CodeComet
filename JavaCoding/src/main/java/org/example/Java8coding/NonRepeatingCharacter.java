package org.example.Java8coding;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        List<Integer> nums = List.of(15, 3, 25, 66, 71, 2);

        int ele = 0;
        try {
            ele = nums.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                    .entrySet()
                    .stream()
                    .filter(entry -> entry.getValue() > 1L)
                    .map(entry -> entry.getKey())
                    .findFirst().get();
        } catch (Exception e) {
            System.out.println(-1);
        }
        System.out.println("FIrst non-repeating element: " + ele);

        System.out.println("local date:"+java.time.LocalDate.now());
        System.out.println("Local date time: "+java.time.LocalDateTime.now());

    }
}
