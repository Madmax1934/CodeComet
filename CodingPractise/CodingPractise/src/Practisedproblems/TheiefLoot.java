package Practisedproblems;

public class TheiefLoot {
    public static void main(String[] args) {
        int arr[] = {9,10,5,7};//{6,5,5,7,4};
        int n = 4;
        System.out.println(findMaxSum(arr,n));
    }

    private static int findMaxSum(int[] arr, int n) {
        int sum=0;
        for(int i=0;i<n-2;i++) {
            for (int k = 2; k < n; k++) {
                sum = Math.max(sum, sumafterkloop(arr, n, k, i));
            }
        }
        return sum;
    }

    private static int sumafterkloop(int[] arr, int n, int k, int i) {
        int sum=0;
        while(i<n)
        {
            sum+=arr[i];
            i+=k;
        }
        return sum;
    }
}
