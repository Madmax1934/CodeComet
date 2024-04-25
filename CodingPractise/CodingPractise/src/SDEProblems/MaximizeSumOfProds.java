package SDEProblems;

import java.util.*;

public class MaximizeSumOfProds {
    public static void main(String[] args) {
        long N = 5;
        long A[] = {6, 1, 9, 5, 4};
        long B[] = {3, 4, 8, 2, 4};
        System.out.println(minValue(A,B,N));
    }

    public static long minValue(long a[], long b[], long n)
    {
        // Your code goes here
        Arrays.sort(a);

        long[] revarray = Arrays.stream(b).boxed().sorted((x,y)-> Math.toIntExact(x - y)).mapToLong(Long::longValue).toArray();
        long sum=0;
        for(int i=0;i<n;i++)
           sum+=(a[i]*revarray[i]);

        return sum;
    }

}
