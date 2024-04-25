package SDEProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class CountDistinctele {
    public static void main(String[] args) {

        int n= 3,k=2;
        int arr[] = {4,1,1};//{1,2,1,3,4,2,3};

        System.out.println(countDistinct(arr,n,k));
    }

    static ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        // code here
        ArrayList<Integer> alist = new ArrayList<>();
        for(int i=0;i<=n-k;i++)
        {
            alist.add((int)Arrays.stream(A,i,i+k).distinct().count());
        }
        return alist;
    }
}
