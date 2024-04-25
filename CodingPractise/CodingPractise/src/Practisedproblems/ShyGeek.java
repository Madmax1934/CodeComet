package Practisedproblems;

public class ShyGeek {
    public static void main(String[] args) {
        int n=4,k=9,count=0,remaining=0;
        int[] a={1,2,3,4};
        for(int i=n-1;i>=0;i--)
        {

            if(k>=a[i])
            {
                count+=k/a[i];
                remaining+=k%a[i];
                k=remaining;
            }
        }
        System.out.println(count);
    }
}
