package SortingAlgorithms;

import java.util.Arrays;

public class MergeSort {

    public static int[] merge(int[] array1,int[] array2)
    {
        int[] combined = new int[array1.length+array2.length];
        int index=0;
        int i=0,j=0;
        while(i<array1.length&&j<array2.length)
        {
            if(array1[i]<array2[j])
            {
                combined[index]= array1[i];
                index++;
                i++;
            }else{
                combined[index]= array2[j];
                index++;
                j++;
            }

        }
        while(i<array1.length)
        {
            combined[index]=array1[i];
            index++;
            i++;
        }
        while(j<array2.length)
        {
            combined[index]=array2[j];
            index++;
            j++;
        }
        return combined;
    }
    public static int[] mergeSort(int[] originalarr)
    {
        if(originalarr.length==1) return originalarr;

        int mid= originalarr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(originalarr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(originalarr,mid,originalarr.length));
        return merge(left,right);
    }
    public static void main(String[] args) {
        int[] originalarray={3,1,4,2};
        int[] sortedarray=mergeSort(originalarray);

        System.out.println(Arrays.toString(sortedarray));
    }
}
