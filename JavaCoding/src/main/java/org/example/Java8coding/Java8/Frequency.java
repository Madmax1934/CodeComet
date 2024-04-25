package org.example.Java8coding.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency {
    public static void main(String[] args) {
        charfreq();
        elemfreq();
    }
    public static void elemfreq()
    {
        List<String> anylist = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        Map<String,Long> map =  anylist.stream().
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map);
    }

    public static void charfreq()
    {
        String str= "Java 8 is sexy";
        Map<Character,Long> freqmap = str.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(freqmap);
    }
}
