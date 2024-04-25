package org.example.Misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleCode {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,5,3,6,7);

//        System.out.println(nums.stream().max().stream().limit());
        nums.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).forEach(System.out::println);
    }
}
