package ArrayPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClosestPair {
    public static void main(String[] args) {
        int arr[] = {1,4,5,7};
        int brr[] = {10,20,30,40};
        int n = arr.length;
        int m = brr.length;
        int x = 32;
        //System.out.println(closestpair(arr,brr,n,m,x));
        System.out.println(printClosest(arr,brr,n,m,x));
    }

    private static ArrayList<Integer> closestpair(int[] arr, int[] brr, int n, int m, int x) {
        ArrayList<Integer> alist = new ArrayList<>();
        int min = Math.abs(x-(arr[0]+brr[0]));
        int index1=0,index2=0;
        int diff=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                diff = Math.abs(x-(arr[i]+brr[j]));
                //System.out.println(Math.min(min,Math.abs(x-(arr[i]+brr[j]))));
                if(diff <= min){
                    min= diff;
                    index1=i;
                    index2=j;
                }
            }
        }
        alist.add(index1);
        alist.add(index2);
        return alist;
    }

    public static ArrayList<Integer> printClosest(int arr[], int brr[], int n, int m, int x) {
        ArrayList<Integer> alist = new ArrayList<>();
        Arrays.sort(brr); // Sort the second array

        int minDiff = Integer.MAX_VALUE;
        int index1 = 0, index2 = 0;

        for (int i = 0; i < n; i++) {
            // Find the position of the element in brr that would make the sum closest to x
            int target = x - arr[i];
            int j = binarySearchClosest(brr, target);
            System.out.println(j);
            // Update the minimum difference and indices if a closer sum is found
            int currentDiff = Math.abs(arr[i] + brr[j] - x);
            if (currentDiff < minDiff) {
                minDiff = currentDiff;
                index1 = i;
                index2 = j;
            }
        }

        alist.add(arr[index1]);
        alist.add(brr[index2]);
        return alist;
    }

    // Binary search to find the closest element in brr to the target
    private static int binarySearchClosest(int[] brr, int target) {
        int left = 0, right = brr.length - 1;
        int closestIndex = -1;
        int minDiff = Integer.MAX_VALUE;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int diff = Math.abs(brr[mid] - target);

            if (diff < minDiff) {
                minDiff = diff;
                closestIndex = mid;
            }

            if (brr[mid] == target) {
                return mid; // Exact match found
            } else if (brr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return closestIndex;
    }

    static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        List<Integer> li = new ArrayList<>();
        Arrays.sort(A);
        Arrays.sort(B);

        for(int i=N-1;i>K;i--)
        {
            for(int j=N-1;j>K;j--){
                li.add(A[i]+B[j]);
            }
        }
        return li;
    }

}
