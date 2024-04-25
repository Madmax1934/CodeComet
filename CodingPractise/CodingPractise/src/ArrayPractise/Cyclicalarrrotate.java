package ArrayPractise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Cyclicalarrrotate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n=5;
        Arrays.stream(arr).sorted();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=(arr[i]*i);
        }

        System.out.println(sum+", "+sum%((int)Math.pow(10,9)+7));
    }
}
