package org.example.Misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

//        for(int i=0;i<10;i++)
//        {
//            nums.add((int)Math.random());
//        }

        int[] arr= new int[10];
        Random rand = new Random();
        Stream.generate(()->new Random().nextInt()).limit(10).forEach(System.out::println);

    }
}
