package org.example.Java8coding.Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamsJava8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(
                234, 780, 451, 639, 456, 98, 75, 43);
        System.out.println(list.stream().filter(i->i%2==0).toList());
        
        // Printing List before sorting
        System.out.println("Before Sorting");

        for (int i : list)
            System.out.print(i + " ");

        System.out.println();

        // Comparator is a functional interface
        // which helps to sort object
        Collections.sort(list, (Integer a1, Integer a2)->
            {
                return (a1 % 100)/10 > (a2 % 100)/10 ? 1 : -1;
            }
        );

        System.out.println("After soring: ");
        list.forEach(System.out::println);


    }
}
