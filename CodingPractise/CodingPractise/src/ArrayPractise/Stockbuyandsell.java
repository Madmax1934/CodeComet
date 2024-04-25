package ArrayPractise;

import java.util.ArrayList;
import java.util.List;

public class Stockbuyandsell {
    public static void main(String[] args) {
        int N = 7;
        int A[] = {100,180,260,310,40,535,695};
        List<Integer> li = new ArrayList<>();
        List<ArrayList<Integer>> outlist=new ArrayList<>();
        int count=0,flag=0,buyday=0,sellday=0;
        for(int i=0;i<N-1;i++)
        {
            if(A[i]<A[i+1])
                count++;
            else if(A[i]==A[i+1]){
                continue;
        }
            else
            {
                flag=1;
                buyday=i-count;
                sellday=i;
                li.add(buyday);
                li.add(sellday);
                outlist.add((ArrayList<Integer>) li);
                System.out.println(outlist);
                li.clear();
                count=0;
            }
        }
        if(flag==0&&!outlist.isEmpty())
        {
            li.add(0);
            li.add(N-1);
            outlist.add((ArrayList<Integer>) li);
        }
        if(outlist.isEmpty())
            System.out.println("No Profit");

    }
}
