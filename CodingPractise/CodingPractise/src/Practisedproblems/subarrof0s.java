package Practisedproblems;

import java.util.ArrayList;

public class subarrof0s {
    public static void main(String[] args) {
        int n = 4;
        int a[]={0, 0, 1, 0};
        for (int i=0;i<n;i++)
        {
            if(a[i]==0)
              subarr(i);
        }
    }
    public static void subarr(int x)
    {
        ArrayList<Integer> arli = new ArrayList<Integer>();
        for(int i=x;i>=0;i--)
        {
            arli.add(i);
        }
    }
}
