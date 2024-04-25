package ArrayPractise;

import java.util.Arrays;

public class TripletswithZerosum {
    public static void main(String[] args) {
        int x=3;
        int arr[] =  {0, -1, 2, -3, 1};
        boolean result = findTripletSumToZero(arr);
        System.out.println(result);
    }
    public static boolean findTripletSumToZero(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            int target = -arr[i];

            while (left < right) {
                int sum = arr[left] + arr[right];

                if (sum == target) {
                    return true;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return false;
    }
}

