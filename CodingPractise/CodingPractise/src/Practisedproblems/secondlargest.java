package Practisedproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class secondlargest {
    public static void main(String[] args) {
        int n = 6;
        int arr[] = {12, 35, 1, 10, 34, 1};
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        ArrayList<Integer> arli = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else {
                hm.put(arr[i],1);
            }

        }
        for(Map.Entry<Integer,Integer> e:hm.entrySet())
        {
            if(e.getValue()==1)
                arli.add(e.getKey());
        }
        Collections.sort(arli);

        System.out.println(arli.get(arli.size()-2));

    }
}
