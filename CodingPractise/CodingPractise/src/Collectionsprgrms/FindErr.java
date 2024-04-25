package Collectionsprgrms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindErr {
    public static void main(String[] args) {
        int N=4;
        int[] arr = {24,14,107,3};
        int max =0;
        for(int i=0;i<N;i++)
        {
            String k="";
            int temp = arr[i];
            while(temp>0)
            {
                k+=temp%10;
                temp/=10;
            }

            //System.out.println((Arrays.stream(arr).sum()+Integer.parseInt(k))-arr[i]);
            if((Arrays.stream(arr).sum()+Integer.parseInt(k))-arr[i]>max)
            {
                max = Arrays.stream(arr).sum()+Integer.parseInt(k)-arr[i];
            }

        }
        System.out.println(max);
    }
}
