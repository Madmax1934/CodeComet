package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr=new int[5];
        arr[0]=5;
        arr[1]=2;
        arr[2]=16;
        arr[3]=3;
        arr[4]=35;

        for(int i=0;i<arr.length;i++)
        {
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex=j;
                }
            }
            if(i!=minIndex) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
