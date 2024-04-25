package Practisedproblems;

import java.util.HashMap;
import java.util.Map;

public class Majorelement {

    public static void main(String[] args) {
        int n = 5;
        int a[] =  {3,1,3,3,2};
        Map<Integer,Integer> fmap = new HashMap<Integer,Integer>();
        int majele = 0;
        for(int i=0;i<a.length;i++)
        {
            fmap.put(a[i],fmap.getOrDefault(a[i],0)+1);

        }
        for(Integer k:fmap.keySet())
        {
            System.out.println("key: "+k+", Value: "+fmap.get(k));
//            if(fmap.get(k)>(n/2))
//                majele = k;
           if(fmap.get(k)>n/2)
           {
               majele = k;
            break;
           }

        }
        System.out.println(majele);

    }
}
