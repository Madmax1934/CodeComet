package org.example.datastructures.arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedElement {

    public static void main(String[] args) {
        LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<>();

        LinkedHashMap<Integer,Integer> countmap = new LinkedHashMap<>();
        int arr[]= {7, 4, 0, 9, 4, 8, 8, 2, 4, 5, 5, 1};//{1, 5, 3, 4, 3, 5, 6};

        int n= arr.length;

        findelement(arr,n);
        for(int i=0;i<n;i++)
        {
            hm.putIfAbsent(arr[i],i);
        }

        System.out.println(hm);

        for(int i=0;i<n;i++)
        {
          countmap.put(arr[i],countmap.getOrDefault(arr[i],0)+1);

        }
        System.out.println(countmap);

        int res=-1;
        for(Map.Entry<Integer,Integer> en:countmap.entrySet()){
            if(en.getValue()>1) {
                res = en.getKey();
                break;
            }
        }

        System.out.println(hm.get(res));

    }

    private static void findelement(int[] arr, int n) {
        LinkedHashSet<Integer> lset = new LinkedHashSet<>();
        int x=0;
        for(int i=0;i< arr.length;i++)
        {
            if(!lset.contains(arr[i]))
            {
                lset.add(arr[i]);
            }
            else{
                x=arr[i];
            }
        }

        for(int i=0;i<n;i++)
        {
            if(x==arr[i])
            {
                System.out.println("index= "+(i+1));
                break;
            }
        }
    }
}
