package ArrayPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class KeyPair {
    public static void main(String[] args) {
        int n = 6, x = 11;
        int arr[] = {1, 4, 45, 6, 10, 8};
        boolean res = keypair(arr,x);
        System.out.println("Sum present?: "+res);
        boolean flag=false;
        sort(arr);
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=x)
            {
                break;
            }
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==x)
                {
                    flag=true;
                    break;
                }

            }
            if(flag==true)
                break;
        }
        System.out.println(flag);
    }

    private static boolean keypair(int[] arr, int x) {
        return Arrays.stream(arr).
                anyMatch(num -> Arrays.stream(arr).anyMatch(otherNum -> num != otherNum && num + otherNum == x));

    }
}
