package Practisedproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class duplicatesinarr {
    public static void main(String[] args) {
        int n = 5;
        int a[] =  {3,1,3,3,2,2,2};
        Map<Integer,Integer> fmap = new HashMap<Integer,Integer>();
        ArrayList<Integer> arli = new ArrayList<Integer>();
        for(int i=0;i<a.length;i++)
        {
            fmap.put(a[i],fmap.getOrDefault(a[i],0)+1);

        }
        for(Integer k:fmap.keySet())
        {
            System.out.println("key: "+k+", Value: "+fmap.get(k));

            if(fmap.get(k)>1)
            {
                arli.add(k);
            }

        }
        System.out.println(arli.stream().mapToInt(Integer::intValue).sorted().toArray());
        int[] temp = arli.stream().mapToInt(Integer::intValue).sorted().toArray();

    }
}
