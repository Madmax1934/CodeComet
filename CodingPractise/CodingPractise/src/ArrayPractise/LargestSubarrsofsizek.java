package ArrayPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestSubarrsofsizek {
    public static void main(String[] args) {
        int arr[] = {8,5,10,7,9,4,15,12,90,13};//{1,2,3,1,4,5,2,3,6};
        int n = arr.length;
        int k = 4;
        System.out.println(maxsubarrs(arr,n,k));
    }

    private static ArrayList<Integer> maxsubarrs(int[] arr, int n, int k) {
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i=0;i+(k-1)<n;i++)
//         list.add(Arrays.stream(arr,i,i+k).max().getAsInt());
//        return list;

        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        // Find maximum in the first window
        for (int i = 0; i < k; i++) {
            max = Math.max(max, arr[i]);
        }
        list.add(max);

        // Slide the window and update maximum for subsequent subarrays
        for (int i = k; i < n; i++) {
            if (arr[i - k] == max) {
                // If the outgoing element was the maximum, recompute maximum in the window
                max = Integer.MIN_VALUE;
                for (int j = i - k + 1; j <= i; j++) {
                    max = Math.max(max, arr[j]);
                }
            } else {
                max = Math.max(max, arr[i]);
            }
            list.add(max);
        }

        return list;

    }
}
