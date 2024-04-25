package org.example.Java8coding;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Freqofchars {

    public static void main(String[] args) {
        String s="tomatao";

       Map<String,Long> map =  Arrays.stream(s.split("")).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}

