package ArrayPractise;

import java.util.HashMap;
import java.util.Map;

public class Countpairsofsum {
    public static void main(String[] args) {
        int arr[]={1,1,1,1}; int n=arr.length;
        int k=2;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i:arr)
        {
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int count=0;
        for(int i: arr)
        {
            int comp= k-i;
            if(mp.containsKey(comp)&&mp.get(comp)>0)
            {
                count++;
                mp.put(i, mp.get(i) - 1);
                mp.put(comp, mp.get(comp) - 1);
            }
        }
        System.out.println(count);
    }
}
