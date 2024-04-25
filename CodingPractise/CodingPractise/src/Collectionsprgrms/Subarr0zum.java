package Collectionsprgrms;

public class Subarr0zum {
    public static void main(String[] args) {
        int n=5;
        int arr[] = {4,2,-3,1,6};


        for(int i=0;i<n;i++)
        {
            System.out.println(subarrsum(arr,i));
        }
    }

    private static boolean subarrsum(int[] arr, int i) {
        int sum=0;
        for(int k=i;k<arr.length;k++)
        {
            sum+=arr[k];
            if(sum==0)
                break;
        }
        return sum==0?true:false;
    }
}
