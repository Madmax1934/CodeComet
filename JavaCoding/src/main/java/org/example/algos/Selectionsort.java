package org.example.algos;

public class Selectionsort {

    public static void main(String[] args) {
        int[] arr=new int[]{1,7,3,5,9};
        int minindex=0;
        for(int i=0;i< arr.length;i++)
        {
            minindex=i;
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[j]<arr[minindex])
                    minindex=j;
            }
            if(i!=minindex) {
                int temp = arr[minindex];
                arr[minindex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
