package Practisedproblems;

import java.util.Arrays;

public class equilibriumpoint {
    public static void main(String[] args) {
         long[] arr = {1,2,3,6,3,2,1};
         int[] intarr = Arrays.stream(arr).mapToInt((l) -> (int) l).toArray();
         int pos = 0;
         int lsum = 0;
         int rsum = Arrays.stream(intarr).sum();


         for(int i=0;i<intarr.length;i++)
         {
             rsum-=intarr[i];
             System.out.println(lsum+", "+rsum);
             if(lsum == rsum)
                 pos = i+1;
             lsum+=intarr[i];
         }
         if(pos==0) pos=-1;

         System.out.println(pos);

    }
}
