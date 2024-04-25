package SortingAlgorithms;

import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int[] arr=new int[5];
        arr[0]=5;
        arr[1]=2;
        arr[2]=16;
        arr[3]=3;
        arr[4]=35;

        for(int i=1;i<arr.length;i++)
        {
            int temp=arr[i];
            for(int j=i-1;j>-1&& temp<arr[j];j--)
            {
                    arr[j+1] = arr[j];
                    arr[j]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
