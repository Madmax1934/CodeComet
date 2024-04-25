package Practisedproblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Missingno {
    public static void main(String[] args) {
        int N=5;
        int arr[] = {1,2,3,4,5};
        List<String> strs = Arrays.asList("Apple","ball","Cat","Dog","Egg","Fan");
        String longeststring = strs.stream().reduce((a,b)->a.length()>b.length()?a:b).orElse("");
        System.out.println(longeststring);

        zigZag(arr,N);

//        String sarr[]={"Apple","Ball","Cat"};
//        System.out.println(missingnum(arr,N));
//        System.out.println(alternateSum(sarr,N));
//        System.out.println(factorial(N));
    }

    private static void zigZag(int[] a, int n) {
        Arrays.sort(a);
        int temp = 0;
        if(n%2==0) {
            for (int i = 1; i < n - 1; i += 2) {
                temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
        }
        else{
            for (int i = 1; i < n ; i += 2) {
                temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
        }
       Arrays.stream(a).forEach(i-> System.out.print(i+" "));
    }


    private static String alternateSum(String[] sarr, int n) {
        return Arrays.stream(sarr).reduce("",(a,b)->a+b);
    }

    private static int missingnum(int[] arr, int size) {
        /*
        int ct = 1;
        int missingnumber = ct;
        while(ct<=size)
        {
            if(!Arrays.stream(arr).filter(i -> i > 0).boxed().collect(Collectors.toList()).contains(ct))
            {
                 missingnumber = ct;
                 break;
            }
            ct++;
        }
        return (ct>size)?ct++:ct;

         */
       return Arrays.stream(arr)
                .filter(num -> num > 0)             // Filter out non-positive numbers
                .distinct()                         // Remove duplicates
                .sorted()                           // Sort the positive numbers
                .reduce(1, (acc, num) -> {
                    if (acc == num) {
                        return acc + 1;
                    } else {
                        return acc;
                    }
                });
    }
}
