package ArrayPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RotateArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int d=2;
        int n= arr.length;

        //using loops and traverse array
        /*
        while(d-->0)
        {
            int temp = arr[0];
            for(int i=0;i<arr.length-1;i++)
            {
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=temp;
            System.out.println("rotated "+d +" time");
        }

         */

        //using list and streams
//        List<Integer> list1 = Arrays.stream(arr,d,n).boxed().collect(Collectors.toList());
//        list1.addAll(Arrays.stream(arr,0,d).boxed().collect(Collectors.toList()));
//        for (int i=0;i< list1.size();i++) {
//            arr[i]=list1.get(i);
//            System.out.println(arr[i]);
//        }

        //2nd approach using loops
        d = d % n; // Handle cases where d > n

        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        for (int i = n - d, j = 0; i < n; i++, j++) {
            arr[i] = temp[j];
        }
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
