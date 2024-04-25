package ArrayPractise;

import java.util.*;

public class Maxnoof1srow {
    public static void main(String[] args) {
        int n=2, m=2;
        int mat[][]= {{0, 1},
                {1, 1}};

        System.out.println(maxones(mat,n,m));
    }

    private static int maxones(int[][] Mat, int N, int M) {

        int hindex = 0;
        int maxct = 0;
        for(int i=0;i<N;i++)
        {
            int arr[]= Mat[i];
            int count = (int)Arrays.stream(arr).filter(ele->ele==1).count();
            if(count>maxct)
            {
                maxct = count;
                hindex=i;
            }
        }
       return hindex;
    }
}
