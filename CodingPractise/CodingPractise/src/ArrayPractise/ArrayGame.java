package ArrayPractise;

public class ArrayGame {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int n= arr.length;
        int brr[]={2,1,3};

        String num = "799";

        int num1 = Integer.valueOf(num.substring(0,num.length()-1));
        int num2 = (Integer.valueOf(num)%10)*2;

        System.out.println((num1-num2)%7);

//        System.out.println(peakElement(arr,n));
//        System.out.println(minoperations(arr,brr,n));
    }

    private static int peakElement(int[] arr, int n) {
        int peek=0;
        for(int i=0;i<n;i++)
        {
            if(i==0 && arr[i]>arr[i+1])
            {
                peek = i;
                break;
            }
            else if(i==n-1 && arr[i]>arr[i-1]){
                peek=i;
                break;
            }
            else{
                if(arr[i]>arr[i+1] && arr[i]>arr[i-1])
                {
                    peek=i;
                    break;
                }
            }
        }
        return peek;
    }

    private static int minoperations(int[] arr, int[] brr, int n) {
        int operations=0;
        while (n > 0) {
            if (arr[0] == brr[0]) {
                // Remove the first element from both arrays
                for (int i = 0; i < n - 1; i++) {
                    arr[i] = arr[i + 1];
                    brr[i] = brr[i + 1];
                }
                operations++;
                n--;
            } else {
                // Rotate the first array anti-clockwise
                int temp = arr[0];
                for (int i = 0; i < n - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[n - 1] = temp;
                operations++;
            }
        }

        return operations;
    }
}
