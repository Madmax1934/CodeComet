package Practisedproblems;

import java.util.Arrays;

public class Minimizeheights {
    public static void main(String[] args) {
       int  K = 5, N = 10;
       int Arr[] = {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};

        Arrays.sort(Arr);
        for(int i=0;i<N;i++)
        {
            if(Arr[i]>=K)
                Arr[i]-=K;
            else Arr[i]+=K;
        }
        Arrays.sort(Arr);
        System.out.println(Arr[N-1]-Arr[0]);
    }
}
