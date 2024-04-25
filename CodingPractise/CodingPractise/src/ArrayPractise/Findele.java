package ArrayPractise;

import java.util.Arrays;

public class Findele {
    public static void main(String[] args) {

        int a[]={1,2,3,0,0,6};
//        int k=4;
//        if(Arrays.binarySearch(a,k)>=0)
//        {
//            System.out.println(Arrays.binarySearch(a,k));
//        }
//
//        else
//            System.out.println(-1);

        int newa[] = new int[a.length];
        for(int i=0,j=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                newa[j]=a[i];
                j++;
            }
        }
        a=Arrays.copyOf(newa,a.length);
        for(int k=0;k<a.length;k++)
        {
            System.out.println(a[k]);
        }

    }
}
