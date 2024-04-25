package Practisedproblems;

import java.util.Arrays;

public class PartitionEqualsumsubset {
    public static void main(String[] args) {
        int n=999; int tar = 20;
        String str = String.valueOf(n);
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            sum+=str.charAt(i);
            if(sum == tar) System.out.println("true");
            if(sum>tar)
            {
                
            }
        }
        int Arr[] = {2,4,11,10,5};
        System.out.println(equalPartition(n,Arr));
    }

    private static boolean equalPartition(int N, int[] arr) {
        Arrays.sort(arr);
        int i=1;
        int leftsum = Arrays.stream(arr, 0, N / 2).sum();
        int rightsum = Arrays.stream(arr, N / 2, N).sum();

        if (leftsum == rightsum)
            return true;
        while (leftsum < rightsum && i<N) {
                leftsum = Arrays.stream(arr, 0, N / 2+i).sum();
                rightsum = Arrays.stream(arr, N / 2+i, N).sum();
                i++;
            }
           return (leftsum == rightsum)?true:false;
        }

}
