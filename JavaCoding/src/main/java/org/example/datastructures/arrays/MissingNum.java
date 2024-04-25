package org.example.datastructures.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr= new int[100];
        for(int i=0;i<100;i++)
        {
            arr[i]=i+1;
        }
        arr[50]=0;
        int sum = Arrays.stream(arr).sum();
        int actual=(100*(100+1))/2;
        System.out.println("Missing number= "+(actual-sum));
        System.out.println("duplicate number found: "+duplicate(arr));
    }

    private static String duplicate(int[] arr) {

       return "duplicate";
    }
}
