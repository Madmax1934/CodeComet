package org.example.Java8coding.Java8;

import java.util.List;
import java.util.function.Function;

public class FP02BehavioralParameterization {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,3,24,4,6,5);
        printBehabehavioralparams(numbers,x->x*x);
    }

    private static void printBehabehavioralparams(List<Integer> numbers, Function<Integer,Integer> predicate) {

        numbers.stream().map(predicate).forEach(System.out::println);
    }
}
