package SDEProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SearchinRotatedArr {
    public static void main(String[] args) {
       int A[] = {3, 5, 1, 2};
       int l =0,h=3;
       int key = 5;

       long arr[] = {1,2,3,4,5,6};
       long x = 5;

        //System.out.println(search(A,l,h,key));
        System.out.println(findK(arr,x));
    }

    private static int findK(long[] arr, long x) {
        if(Arrays.stream(arr).findAny().isPresent())
          return (int)Arrays.stream(arr).filter(i->i<x).max().getAsLong();
        else
            return -1;
    }

    private static int search(int[] A, int l, int h, int key) {

        int index = IntStream.range(l, h+1).filter(i -> A[i] == key).reduce((a,b)->-1).orElse(-1);
        List<int[]> alist = Arrays.asList(A).stream().toList();
        return index;

    }

}


