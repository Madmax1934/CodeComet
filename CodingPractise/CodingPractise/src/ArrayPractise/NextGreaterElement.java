package ArrayPractise;

public class NextGreaterElement {
    public static void main(String[] args) {
        long arr[] = {1,5,2,4};
        int n = arr.length;
        nextgreatarray(arr,n);
        for(long k:arr)
        {
            System.out.printf(k+" ");
        }
    }

    private static long[] nextgreatarray(long[] arr, int n) {
        for(int i=0;i<n;i++)
        {
            if(i==n-1){
                arr[i]=-1;
                break;
            }
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>arr[i])
                {
                    arr[i]=arr[j];
                    break;
                }
                if(j==n-1)
                    arr[i]=-1;

            }

        }

        return arr;
    }
}
