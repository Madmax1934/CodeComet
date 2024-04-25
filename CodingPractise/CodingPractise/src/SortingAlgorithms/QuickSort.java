package SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
    public static void quicksort(int[] array,int left,int right)
    {
        if(left<right) {
            int pivotindex = pivot(array, left, right);
            quicksort(array, left, pivotindex + 1);
            quicksort(array, pivotindex - 1, right);
        }
    }
    public static int pivot(int[] array,int pivotind , int endindex)
    {
        int swapind=pivotind;

        for(int i=pivotind+1;array[i]<array[pivotind];i++)
        {
            swapind++;
            swap(array,swapind,i);
        }
        swap(array,pivotind,swapind);
        return swapind;
    }
    public static void swap(int[] array,int firstind,int secondind)
    {
        int temp = array[firstind];
        array[firstind]=array[secondind];
        array[secondind]=temp;
    }
    public static void main(String[] args) {
        int []array = {4,6,1,7,3,2,5};
        quicksort(array,0,6);
        System.out.println(Arrays.toString(array));
    }
}
