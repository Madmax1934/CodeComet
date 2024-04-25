package Practisedproblems;

import java.util.Arrays;

public class decimalcheck {
    public static void main(String[] args) {
        int n = 5;
        int A[] = {1,4,5,3,10};

        int index=0;
        int sumleft = 0;
        int sumright=0;
        for(int i=0;i<n;i++)
        {
            sumleft = Arrays.stream(A,0,i+1).sum();
            sumright = Arrays.stream(A,i,n).sum();
            if(sumleft==sumright)
                index=i+1;
        }
        System.out.println(index);
    }
}
