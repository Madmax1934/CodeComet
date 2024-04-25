package org.example.corejavacoding;

//Input : [1,3,4,5,-3,-6,5,7,2,-2]
// - Write a program where all positve numbers come on left side
// and negative numbers on right side

import java.util.Arrays;

//solution: We can solve this problem using two pointer approach
public class SeperateNumbers {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,-3,-6,5,7,2,-2};

        int left =0;
        int right = arr.length-1;

        while(left<right)
        {
            if(arr[left]<0&&arr[right]>0)
            {
                int temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }

            else if(arr[left]>0)
            {
                left++;
            }
            else if(arr[right]<0){
                right--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
