package Practisedproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class maxprodsubarr {
    public static void main(String[] args) {
        int n=5;
        int arr[]={6, -3, -10, 0, 2};

        ArrayList<Integer> arli = new ArrayList<Integer>();
        int count=0;
        int prod=1;
        for (int i1=0;i1< arr.length;i1++) {
            if (arr[i1] < 0) {
                arli.add(arr[i1]);
            } else if (arr[i1]==0) {
                break;
            }
            else{
                prod*=arr[i1];}
        }

        Collections.sort(arli);

        if(count%2!=0)
        {
            int size=arli.size()-1;
            System.out.println(arli.stream().limit(size).reduce(prod,(a,b)->a*b));
        }
        else
          System.out.println(arli.stream().reduce(prod,(a,b)->a*b));

    }
}
