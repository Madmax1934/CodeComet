package Practisedproblems;

import java.util.ArrayList;
import java.util.List;

public class Listexample {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(5);
        A.add(4);
        A.add(9);
        A.add(3);

        int Q = 1;
        List<Integer> Query = new ArrayList<>();
        Query.add(2);
        Query.add(6);

        if(Q==1)
        {
            A.add(Query.get(0), Query.get(1));
        }
        if(Q==2)
        {
            if(A.lastIndexOf(Query.get(0))>A.size())
              System.out.println(-1);
        }

        System.out.println(A);
    }
}
