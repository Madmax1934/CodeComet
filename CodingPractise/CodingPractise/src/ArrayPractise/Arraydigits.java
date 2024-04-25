package ArrayPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraydigits {
    public static void main(String[] args) {
        int arr[]={4, 1, 1, 3};
        int N=4;
        //System.out.println(Arrays.stream(arr,0,arr.length-1).sorted().sum());
        if(Arrays.stream(arr).sorted().distinct().count()==N)
        {
            System.out.println(Arrays.stream(arr).sorted().limit(N-1).sum());
        }
        else{
            System.out.println(Arrays.stream(arr).sorted().distinct().sum());
        }
        //System.out.println(isPossible(N,arr));
    }
    static int isPossible(int N, int arr[]) {
        // code here
        int sum=0,s=0;

        for(int i:arr)
        {
            while(i>0)
            {
                s+=i%10;
                i/=10;
            }
            sum+=s;
            s=0;
        }
        return sum%3==0?1:0;
        /*
        int sod= Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .map(str -> str.split(""))
                .flatMap(Arrays::stream)
                .mapToInt(Integer::parseInt)
                .sum();

        return sod%3==0?1:0;

         */

    }
}
