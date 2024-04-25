package org.example.algos;

import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int[] arr=new int[]{1,7,3,5,9};
        for(int i=1;i<arr.length;i++)
        {
            int temp = arr[i];
            int j=i-1;
            while(j>-1&&temp<arr[j])
            {
                arr[j+1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
