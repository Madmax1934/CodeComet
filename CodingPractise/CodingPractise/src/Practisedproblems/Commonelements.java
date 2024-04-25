package Practisedproblems;

import java.util.*;
import java.util.stream.Collectors;

public class Commonelements {
    public static void main(String[] args) {
        int[] A = {1, 5, 10, 20, 40, 80};
        int B[]=  {6, 7, 20, 80, 100};
        int C[] ={3, 4, 15, 20, 30, 70, 80, 120};

        int n1= A.length;
        int n2 = B.length;
        int n3=C.length;

        List<Integer> la =  new ArrayList<>();//Arrays.stream(A).boxed().collect(Collectors.toList());
        List<Integer> lb = new ArrayList<>();  //Arrays.stream(B).boxed().collect(Collectors.toList());
        List<Integer> lc =  new ArrayList<>();//Arrays.stream(C).boxed().collect(Collectors.toList());

        Arrays.stream(A).forEach(x-> la.add(x));
        Arrays.stream(B).forEach(x-> lb.add(x));
        Arrays.stream(C).forEach(x-> lc.add(x));

        List<Integer> sizelist = new ArrayList<>();


        for(int i:la)
        {
            if(lb.contains(i) && lc.contains(i))
            {
              sizelist.add(i);
            }
        }
     // Collections.reverse(sizelist);
        int k=3;
        System.out.println(Arrays.stream(A).sorted().skip(k-1).sum());
     System.out.println(sizelist);
    }
}
