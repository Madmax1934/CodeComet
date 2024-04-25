package org.example.algos;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int array[] = new int[]{4,2,1,6,8};
        for(int i= array.length-1;i>=0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
