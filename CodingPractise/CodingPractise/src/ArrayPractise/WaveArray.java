package ArrayPractise;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int a[] = {1, 45, 47, 50, 5};//{1,2,3,4,5,6};
        int n = a.length;
        covertTowave(n,a);
    }

    private static void covertTowave(int n, int[] a) {
        for(int i=0;i<n && i+1<n;i+=2)
        {
            int temp = a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
    }
}
