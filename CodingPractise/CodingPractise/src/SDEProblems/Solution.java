package SDEProblems;

import java.util.ArrayList;
import java.util.Arrays;

class Solution
{
    public static void main(String[] args) {
        int n = 7, k = 4;
        int A[] = {1,2,1,3,4,2,3};
        // code here
        ArrayList<Integer> alist = new ArrayList<>();
        for(int i=0;i<=n-k;i++)
        {
            alist.add((int) Arrays.stream(A,i,i+k).distinct().count());
            System.out.println(alist.get(i));
        }

    }

}
